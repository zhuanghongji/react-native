/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.tasks.internal

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.io.Serializable

/**
 * TODO
 */
abstract class PreparePrefabHeadersTask : DefaultTask() {

  @get:Input
  abstract val input: ListProperty<PrefabPreprocessingEntry>

  @get:OutputDirectory
  abstract val outputDir: DirectoryProperty

  @TaskAction
  fun taskAction() {
    input.get().forEach { (libraryName, headerPath, headerPrefix) ->
      val outputFolder: RegularFile = outputDir.file(libraryName).get()
      project.copy {
        it.from(headerPath)
        it.include("**/*.h")
        it.exclude("**/*.cpp")
        it.exclude("**/*.txt")
        it.into(File(outputFolder.asFile, headerPrefix))
      }
    }
  }
}

data class PrefabPreprocessingEntry(
  val libraryName: String,
  val headerPath: String,
  val headerPrefix: String
): Serializable

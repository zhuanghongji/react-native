/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.tasks.internal

import com.facebook.react.tasks.internal.utils.PrefabPreprocessingEntry
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.ListProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject

/**
 * TODO
 */
abstract class PreparePrefabHeadersTask : DefaultTask() {

  @get:Input
  abstract val input: ListProperty<PrefabPreprocessingEntry>

  @get:OutputDirectory
  abstract val outputDir: DirectoryProperty

  @get:Inject
  abstract val fs: FileSystemOperations

  @TaskAction
  fun taskAction() {
    input.get().forEach { (libraryName, pathToPrefixCouples) ->
      val outputFolder: RegularFile = outputDir.file(libraryName).get()
      pathToPrefixCouples.forEach { (headerPath, headerPrefix) ->
        fs.copy {
          it.from(headerPath)
          it.include("**/*.h")
          it.exclude("**/*.cpp")
          it.exclude("**/*.txt")
          it.include("boost/config.hpp")
          it.include("boost/config/**/*.hpp")
          it.include("boost/core/*.hpp")
          it.include("boost/detail/workaround.hpp")
          it.include("boost/operators.hpp")
          it.include("boost/preprocessor/**/*.hpp")
          it.into(File(outputFolder.asFile, headerPrefix))
        }
      }
    }
  }
}

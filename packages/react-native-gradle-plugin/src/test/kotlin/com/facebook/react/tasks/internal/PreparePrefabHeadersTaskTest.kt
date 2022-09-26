/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.tasks.internal

import com.facebook.react.tests.createProject
import com.facebook.react.tests.createTestTask
import java.io.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class PreparePrefabHeadersTaskTest {

  @get:Rule val tempFolder = TemporaryFolder()

  @Test(expected = IllegalStateException::class)
  fun preparePrefabHeadersTask_withMissingConfiguration_fails() {
    val task = createTestTask<PreparePrefabHeadersTask>()

    task.taskAction()
  }

  @Test
  fun preparePrefabHeadersTask_copiesMakefile() {
    val boostpath = tempFolder.newFolder("boostpath")
    val output = tempFolder.newFolder("output")
    val project = createProject()
    val task =
        createTestTask<PreparePrefabHeadersTask>(project = project) {
          it.outputDir.set(output)
        }
    File(project.projectDir, "src/main/jni/third-party/boost/Android.mk").apply {
      parentFile.mkdirs()
      createNewFile()
    }
    task.taskAction()

    assertTrue(output.listFiles()!!.any { it.name == "Android.mk" })
  }

  @Test
  fun preparePrefabHeadersTask_copiesAsmFiles() {
    val boostpath = tempFolder.newFolder("boostpath")
    val output = tempFolder.newFolder("output")
    val task =
        createTestTask<PreparePrefabHeadersTask>() {
          it.outputDir.set(output)
        }
    File(boostpath, "asm/asm.S").apply {
      parentFile.mkdirs()
      createNewFile()
    }
    task.taskAction()

    assertTrue(File(output, "asm/asm.S").exists())
  }

  @Test
  fun preparePrefabHeadersTask_copiesBoostSourceFiles() {
    val boostpath = tempFolder.newFolder("boostpath")
    val output = tempFolder.newFolder("output")
    val task =
        createTestTask<PreparePrefabHeadersTask> {
          it.outputDir.set(output)
        }
    File(boostpath, "boost_1.0.0/boost/config.hpp").apply {
      parentFile.mkdirs()
      createNewFile()
    }
    task.taskAction()

    assertTrue(File(output, "boost_1.0.0/boost/config.hpp").exists())
  }

  @Test
  fun preparePrefabHeadersTask_copiesVersionlessBoostSourceFiles() {
    val boostpath = tempFolder.newFolder("boostpath")
    val output = tempFolder.newFolder("output")
    val task =
        createTestTask<PreparePrefabHeadersTask> {
          it.outputDir.set(output)
        }
    File(boostpath, "boost/boost/config.hpp").apply {
      parentFile.mkdirs()
      createNewFile()
    }
    task.taskAction()

    assertTrue(File(output, "boost_1.0.0/boost/config.hpp").exists())
  }
}

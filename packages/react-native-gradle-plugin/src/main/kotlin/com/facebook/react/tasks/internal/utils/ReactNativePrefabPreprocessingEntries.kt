@file:JvmName("ReactNativePrefabProcessingEntities")
package com.facebook.react.tasks.internal.utils

import org.gradle.api.Project
import java.io.File

fun getEntities(project: Project) = listOf(
  PrefabPreprocessingEntry("react_render_debug", project.file("../ReactCommon/react/renderer/debug/").absolutePath, "react/renderer/debug/"),
  PrefabPreprocessingEntry("turbomodulejsijni", project.file("src/main/jni/react/turbomodule").absolutePath, ""),
  PrefabPreprocessingEntry("runtimeexecutor", project.file("../ReactCommon/runtimeexecutor/").absolutePath, ""),
  PrefabPreprocessingEntry("react_codegen_rncore", File(project.buildDir, "generated/source/codegen/jni/").absolutePath, ""),
  PrefabPreprocessingEntry("react_debug", project.file("../ReactCommon/react/debug/").absolutePath, "react/debug/"),
  PrefabPreprocessingEntry("react_render_componentregistry", project.file("../ReactCommon/react/renderer/componentregistry/").absolutePath, "react/debug/"),
  PrefabPreprocessingEntry("react_render_core", project.file("../ReactCommon/react/renderer/core/").absolutePath, "react/renderer/core/"),
  PrefabPreprocessingEntry("react_newarchdefaults", project.file("src/main/jni/react/newarchdefaults").absolutePath, ""),
  PrefabPreprocessingEntry("react_render_graphics", project.file("../ReactCommon/react/renderer/graphics/").absolutePath, "react/renderer/graphics/"),
  PrefabPreprocessingEntry("react_render_graphics", project.file("../ReactCommon/react/renderer/graphics/platform/cxx/").absolutePath, ""),
  PrefabPreprocessingEntry("react_render_mapbuffer", project.file("../ReactCommon/react/renderer/mapbuffer/").absolutePath, "react/renderer/mapbuffer/"),
  PrefabPreprocessingEntry("rrc_view", project.file("../ReactCommon/react/renderer/components/view/").absolutePath, "react/renderer/components/view/"),
  PrefabPreprocessingEntry("jsi", project.file("../ReactCommon/jsi/").absolutePath, ""),
  PrefabPreprocessingEntry("glog", File(project.buildDir, "third-party-ndk/glog/exported/").absolutePath, ""),
  PrefabPreprocessingEntry("yoga", project.file("../ReactCommon/yoga/").absolutePath, ""),
  PrefabPreprocessingEntry("yoga", project.file("src/main/jni/first-party/yogajni/jni").absolutePath, ""),
  PrefabPreprocessingEntry("fabricjni", project.file("src/main/jni/react/fabric").absolutePath, ""),
  PrefabPreprocessingEntry("react_nativemodule_core", project.file("../ReactCommon/react/nativemodule/core/").absolutePath, ""),
  PrefabPreprocessingEntry("react_nativemodule_core", project.file("../ReactCommon/react/nativemodule/core/platform/android/").absolutePath, ""),
  PrefabPreprocessingEntry("react_nativemodule_core", project.file("../ReactCommon/callinvoker/").absolutePath, ""),
  // Too wide - Risk of API exposure
  PrefabPreprocessingEntry("react_nativemodule_core", project.file("../ReactCommon/").absolutePath, ""),
  PrefabPreprocessingEntry("react_nativemodule_core", project.file("src/main/jni/react/jni").absolutePath, "react/jni/"),
  PrefabPreprocessingEntry("react_nativemodule_core", File(project.buildDir, "third-party-ndk/folly/").absolutePath, ""),
  PrefabPreprocessingEntry("react_nativemodule_core", File(project.buildDir, "third-party-ndk/boost/boost_1_76_0/").absolutePath, ""),
  PrefabPreprocessingEntry("react_nativemodule_core", File(project.buildDir, "third-party-ndk/double-conversion/").absolutePath, ""),
  PrefabPreprocessingEntry("folly_runtime", File(project.buildDir, "third-party-ndk/folly/").absolutePath, ""),
  PrefabPreprocessingEntry("folly_runtime", File(project.buildDir, "third-party-ndk/boost/boost_1_76_0/").absolutePath, ""),
  PrefabPreprocessingEntry("folly_runtime", File(project.buildDir, "third-party-ndk/double-conversion/").absolutePath, ""),
)

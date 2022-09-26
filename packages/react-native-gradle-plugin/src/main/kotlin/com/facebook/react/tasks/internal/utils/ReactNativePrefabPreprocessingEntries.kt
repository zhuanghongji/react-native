@file:JvmName("ReactNativePrefabProcessingEntities")

package com.facebook.react.tasks.internal.utils

import java.io.File

fun getEntities(buildDir: File) = listOf(
  PrefabPreprocessingEntry(
    "react_render_debug",
    "../ReactCommon/react/renderer/debug/" to "react/renderer/debug/"
  ),
  PrefabPreprocessingEntry(
    "turbomodulejsijni",
    "src/main/jni/react/turbomodule" to ""
  ),
  PrefabPreprocessingEntry(
    "runtimeexecutor",
    "../ReactCommon/runtimeexecutor/" to ""
  ),
  PrefabPreprocessingEntry(
    "react_codegen_rncore",
    File(buildDir, "generated/source/codegen/jni/").absolutePath to ""
  ),
  PrefabPreprocessingEntry(
    "react_debug",
    "../ReactCommon/react/debug/" to "react/debug/"
  ),
  PrefabPreprocessingEntry(
    "react_render_componentregistry",
    "../ReactCommon/react/renderer/componentregistry/" to "react/renderer/componentregistry/"
  ),
  PrefabPreprocessingEntry(
    "react_render_core",
    "../ReactCommon/react/renderer/core/" to "react/renderer/core/"
  ),
  PrefabPreprocessingEntry(
    "react_newarchdefaults",
    "src/main/jni/react/newarchdefaults" to ""
  ),
  PrefabPreprocessingEntry(
    "react_render_graphics",
    listOf(
      "../ReactCommon/react/renderer/graphics/" to "react/renderer/graphics/",
      "../ReactCommon/react/renderer/graphics/platform/cxx/" to ""
    )
  ),
  PrefabPreprocessingEntry(
    "react_render_mapbuffer",
    "../ReactCommon/react/renderer/mapbuffer/" to "react/renderer/mapbuffer/"
  ),
  PrefabPreprocessingEntry(
    "rrc_view",
    "../ReactCommon/react/renderer/components/view/" to "react/renderer/components/view/"
  ),
  PrefabPreprocessingEntry(
    "jsi",
    "../ReactCommon/jsi/" to ""
  ),
  PrefabPreprocessingEntry(
    "glog",
    File(buildDir, "third-party-ndk/glog/exported/").absolutePath to ""
  ),
  PrefabPreprocessingEntry(
    "yoga",
    listOf(
      "../ReactCommon/yoga/" to "",
      "src/main/jni/first-party/yogajni/jni" to ""
    )
  ),
  PrefabPreprocessingEntry(
    "fabricjni",
    "src/main/jni/react/fabric" to ""
  ),
  PrefabPreprocessingEntry(
    "react_nativemodule_core",
    listOf(
      File(buildDir, "third-party-ndk/boost/boost_1_76_0/").absolutePath to "",
      File(buildDir, "third-party-ndk/double-conversion/").absolutePath to "",
      File(buildDir, "third-party-ndk/folly/").absolutePath to "",
      "../ReactCommon/butter/" to "butter/",
      "../ReactCommon/callinvoker/" to "",
      "../ReactCommon/react/bridging/" to "react/bridging/",
      "../ReactCommon/react/config/" to "react/config/",
      "../ReactCommon/react/nativemodule/core/" to "",
      "../ReactCommon/react/nativemodule/core/platform/android/" to "",
      "../ReactCommon/react/renderer/componentregistry/" to "react/renderer/componentregistry/",
      "../ReactCommon/react/renderer/components/root/" to "react/renderer/components/root/",
      "../ReactCommon/react/renderer/leakchecker/" to "react/renderer/leakchecker/",
      "../ReactCommon/react/renderer/mapbuffer/" to "react/renderer/mapbuffer/",
      "../ReactCommon/react/renderer/mounting/" to "react/renderer/mounting/",
      "../ReactCommon/react/renderer/runtimescheduler/" to "react/renderer/runtimescheduler/",
      "../ReactCommon/react/renderer/scheduler/" to "react/renderer/scheduler/",
      "../ReactCommon/react/renderer/telemetry/" to "react/renderer/telemetry/",
      "../ReactCommon/react/renderer/uimanager/" to "react/renderer/uimanager/",
      "../ReactCommon/react/utils/" to "react/utils/",
      "src/main/jni/react/jni" to "react/jni/",
    ),
  ),
  PrefabPreprocessingEntry(
    "folly_runtime",
    listOf(
      File(buildDir, "third-party-ndk/folly/").absolutePath to "",
      File(buildDir, "third-party-ndk/boost/boost_1_76_0/").absolutePath to "",
      File(buildDir, "third-party-ndk/double-conversion/").absolutePath to ""
    )
  ),
)

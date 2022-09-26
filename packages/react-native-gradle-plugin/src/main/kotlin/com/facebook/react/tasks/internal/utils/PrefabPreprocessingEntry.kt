package com.facebook.react.tasks.internal.utils

import java.io.Serializable

data class PrefabPreprocessingEntry(
  val libraryName: String,
  val headerPath: String,
  val headerPrefix: String
): Serializable

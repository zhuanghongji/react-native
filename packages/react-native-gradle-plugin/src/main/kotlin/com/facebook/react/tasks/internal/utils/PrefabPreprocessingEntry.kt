package com.facebook.react.tasks.internal.utils

import java.io.Serializable

data class PrefabPreprocessingEntry(
  val libraryName: String,
  val pathToPrefixCouples: List<Pair<String, String>>,
) : Serializable {
  constructor(libraryName: String, pathToPrefixCouple: Pair<String, String>) : this(
    libraryName,
    listOf(pathToPrefixCouple)
  )
}

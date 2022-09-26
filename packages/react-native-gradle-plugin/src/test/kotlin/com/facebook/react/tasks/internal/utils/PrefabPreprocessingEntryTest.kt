package com.facebook.react.tasks.internal.utils

import groovy.test.GroovyTestCase.assertEquals
import org.junit.Test

class PrefabPreprocessingEntryTest {

  @Test
  fun secondaryConstructor_createsAList() {
    val sampleEntry = PrefabPreprocessingEntry(
      libraryName = "justALibrary",
      pathToPrefixCouple = "aPath" to "andAPrefix"
    )

    assertEquals(1, sampleEntry.pathToPrefixCouples.size)
    assertEquals("aPath", sampleEntry.pathToPrefixCouples[0].first)
    assertEquals("andAPrefix", sampleEntry.pathToPrefixCouples[0].second)
  }
}

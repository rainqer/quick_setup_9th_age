package org.auspiciousrhino.listimport

import org.auspiciousrhino.quicksetup.listimport.ParsedEntry
import org.junit.Assert.*
import org.junit.Test

private const val LINE_1 = "130 - Goblin Wolf Chariots"
private const val LINE_2 = "905 - Goblin Witch Doctor, Forest Goblin, Gargantula (Spider Mother Shrine), Wizard Master, Thaumaturgy, Skull Fetish"
private const val LINE_3 = "90 - 3 Grotlings"
private const val LINE_4 = "574 - 21 Iron Orcs, Standard Bearer (Mikinok's Totem), Musician, Champion"
private const val LINE_5 = "90 - Skewerer"

class ParsedEntryTest {

  @Test
  fun shouldParseLine1() {
    // given
    val parsedEntry = ParsedEntry(LINE_1)

    // when
    val entry = parsedEntry.entry

    // then
    assertEquals("Goblin Wolf Chariots", entry!!.name)
    assertEquals(130, entry.pointValue)
  }

  @Test
  fun shouldParseLine2() {
    // given
    val parsedEntry = ParsedEntry(LINE_2)

    // when
    val entry = parsedEntry.entry

    // then
    assertEquals("Goblin Witch Doctor", entry!!.name)
    assertEquals(905, entry.pointValue)
  }

  @Test
  fun shouldParseLine3() {
    // given
    val parsedEntry = ParsedEntry(LINE_3)

    // when
    val entry = parsedEntry.entry

    // then
    assertEquals("3 Grotlings", entry!!.name)
    assertEquals(90, entry.pointValue)
  }

  @Test
  fun shouldParseLine4() {
    // given
    val parsedEntry = ParsedEntry(LINE_4)

    // when
    val entry = parsedEntry.entry

    // then
    assertEquals("21 Iron Orcs", entry!!.name)
    assertEquals(574, entry.pointValue)
  }

  @Test
  fun shouldParseLine5() {
    // given
    val parsedEntry = ParsedEntry(LINE_5)

    // when
    val entry = parsedEntry.entry

    // then
    assertEquals("Skewerer", entry!!.name)
    assertEquals(90, entry.pointValue)
  }

  @Test
  fun shouldNotParseEmptyLine() {
    // given
    val parsedEntry = ParsedEntry("")

    // when
    val entry = parsedEntry.entry

    // then
    assertNull(entry)
  }

  @Test
  fun shouldNotParseLineWithTitle() {
    // given
    val parsedEntry = ParsedEntry("Orcs and Goblins")

    // when
    val entry = parsedEntry.entry

    // then
    assertNull(entry)
  }

  @Test
  fun shouldNotParseLineWithPoints() {
    // given
    val parsedEntry = ParsedEntry("4491")

    // when
    val entry = parsedEntry.entry

    // then
    assertNull(entry)
  }
}
package org.auspiciousrhino.listimport

import org.junit.Assert.assertEquals
import org.junit.Test

private val TEST_LIST_1 = """
  Orcs and Goblins
  905 - Goblin Witch Doctor, Forest Goblin, Gargantula (Spider Mother Shrine), Wizard Master, Thaumaturgy, Skull Fetish
  230 - Goblin Witch Doctor, Common Goblin and Light Armour, Goblin Wolf Chariot, Wizard Adept, Pyromancy
  415 - Orc Warlord, General, Feral Orc, Paired Weapons (Shady Shanking), Light Armour (Essence of Mithril), Ranger's Boots
  250 - Orc Chief, Iron Orc, Shield (Willow's Ward), Battle Standard Bearer, Plate Armour (Alchemist's Alloy)
  580 - 35 Orcs, Feral Orc, Spear, Standard Bearer (Green Tide), Musician, Champion
  395 - 30 Goblins, Cave Goblin, Spear and Shield, 2x Mad Gits, Standard Bearer (Banner of the Relentless Company), Musician, Champion
  153 - 8 Goblin Raiders, Forest Goblin, Bow
  574 - 21 Iron Orcs, Standard Bearer (Mikinok's Totem), Musician, Champion
  254 - 6 Mounted 'Eadbashers, Common Orc, Shield, Lance, Musician, Champion
  130 - Goblin Wolf Chariots
  90 - 3 Grotlings
  195 - Greenhide Catapult, Git Launcher
  140 - Greenhide Catapult, Splatterer
  90 - Skewerer
  90 - Skewerer
  4491
""".trimIndent()

class ParsedListTest {

  @Test
  fun shouldParseList() {
    // given
    val parsedList = ParsedList(TEST_LIST_1)

    // when
    val list = parsedList.list

    // then
    assertEquals(15, list.entries.size)
    assertEquals("Goblin Witch Doctor", list.entries[0].name)
    assertEquals(905, list.entries[0].pointValue)
  }
}
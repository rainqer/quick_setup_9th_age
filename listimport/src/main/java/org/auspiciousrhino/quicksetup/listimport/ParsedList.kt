package org.auspiciousrhino.quicksetup.listimport

import org.auspiciousrhino.quicksetup.domain.ArmyList

internal class ParsedList(private val rawList: String) {

  val list: ArmyList
  get() = rawList.lines()
    .mapNotNull { ParsedEntry(it).entry }
    .toList()
    .let { ArmyList(it) }
}
package org.auspiciousrhino.listimport

import org.auspiciousrhino.domain.ArmyList

internal class ParsedList(private val rawList: String) {

  val list: ArmyList
  get() = rawList.lines()
    .mapNotNull { ParsedEntry(it).entry }
    .toList()
    .let { ArmyList(it) }
}
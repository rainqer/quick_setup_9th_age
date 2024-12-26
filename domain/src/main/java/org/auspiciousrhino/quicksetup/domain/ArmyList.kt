package org.auspiciousrhino.quicksetup.domain

data class ArmyList(val entries: List<ListEntry>) {

  val isEmpty: Boolean = entries.isEmpty()
}
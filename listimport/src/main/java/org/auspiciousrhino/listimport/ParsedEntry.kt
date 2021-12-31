package org.auspiciousrhino.listimport

import org.auspiciousrhino.domain.ListEntry

internal class ParsedEntry(private val entryLine: String) {

  val entry: ListEntry?
  get() {
    val pointValueAndName = entryLine.split("-")
    if (pointValueAndName.size != 2) return null
    val entryPointValue = tryParsingPointValue(pointValueAndName) ?: return null
    val entryName = parseEntryName(pointValueAndName) ?: return null
    val entryDetails = parseEntryDetails(pointValueAndName)
    return ListEntry(entryName, entryDetails, entryPointValue)
  }

  private fun tryParsingPointValue(pointValueAndName: List<String>): Int? =
    try {
      pointValueAndName[POINT_VALUE_INDEX].trim().toInt()
    } catch (e: NumberFormatException) {
      null
    }

  private fun parseEntryName(pointValueAndName: List<String>) =
    pointValueAndName[NAME_ANE_DETAILS_INDEX].trim().split(",").firstOrNull()

  private fun parseEntryDetails(pointValueAndName: List<String>) =
    pointValueAndName[NAME_ANE_DETAILS_INDEX].trim().split(",").drop(1).takeIf { it.isNotEmpty() }?.joinToString(", ")
}

private const val POINT_VALUE_INDEX = 0
private const val NAME_ANE_DETAILS_INDEX = 1
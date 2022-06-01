package org.auspiciousrhino.storage

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import org.auspiciousrhino.domain.ArmyList


class ArmyListRepository internal constructor(
  private val sharedPreferences: SharedPreferences,
  private val gson: Gson
) {

  constructor(context: Context) : this(
    context.getSharedPreferences("armyList", Context.MODE_PRIVATE),
    Gson()
  )

  var myArmyList: ArmyList?
    get() = sharedPreferences.getString(ARMY_KEY, "")
      .takeIf { !it.isNullOrBlank() }
      ?.let { gson.fromJson(it, ArmyList::class.java) }
    set(value) {
      sharedPreferences.edit().putString(ARMY_KEY, gson.toJson(value)).apply()
    }
}

private const val ARMY_KEY = "ARMY_KEY"
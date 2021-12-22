package org.auspiciousrhino.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.auspiciousrhino.domain.TerrainLayout

class TerrainLayoutView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

  init {
    inflate(context, R.layout.view_terrain_layout, this)
    orientation = VERTICAL
  }

  var viewEntity: TerrainLayout? = null
    set(value) {
      field = value
      findViewById<TextView>(R.id.terrainLayoutTitle).setText(value?.name ?: 0)
      findViewById<ImageView>(R.id.terrainLayoutImage).setImageResource(value?.image ?: 0)
    }
}
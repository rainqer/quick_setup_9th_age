package org.auspiciousrhino.quicksetup.armylistpreview

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ListEntryDecoration(private val spaceSize: Int) : RecyclerView.ItemDecoration() {

  override fun getItemOffsets(
    outRect: Rect,
    view: View,
    parent: RecyclerView,
    state: RecyclerView.State
  ) {
    with(outRect) {
      if (parent.getChildAdapterPosition(view) == 0) {
        top = spaceSize
      }
      left = spaceSize
      right = spaceSize
      bottom = spaceSize
    }
  }
}
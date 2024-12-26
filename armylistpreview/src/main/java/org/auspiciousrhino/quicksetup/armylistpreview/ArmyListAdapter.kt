package org.auspiciousrhino.quicksetup.armylistpreview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.auspiciousrhino.quicksetup.domain.ListEntry
import org.auspiciousrhino.quicksetup.ui.ArmyListEntryView

internal class ArmyListAdapter
  : ListAdapter<ListEntry, ListEntryViewHolder>(ListEntryDiffCallBack()) {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListEntryViewHolder {
    return ListEntryViewHolder(ArmyListEntryView(parent.context))
  }

  override fun onBindViewHolder(holder: ListEntryViewHolder, position: Int) {
    holder.bind(getItem(position))
  }
}

internal class ListEntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  fun bind(listEntry: ListEntry) {
    (itemView as ArmyListEntryView).viewEntity = listEntry
  }
}

private class ListEntryDiffCallBack : DiffUtil.ItemCallback<ListEntry>() {

  override fun areItemsTheSame(oldItem: ListEntry, newItem: ListEntry): Boolean =
    (oldItem === newItem)

  override fun areContentsTheSame(oldItem: ListEntry, newItem: ListEntry): Boolean =
    (oldItem == newItem)
}

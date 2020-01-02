package com.tunc.mvvm_architecture.base

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.tunc.mvvm_architecture.utils.DiffAdapter
import kotlin.properties.Delegates

abstract class BaseAdapter<M : BaseModel, VH : BaseViewHolder<M, ViewDataBinding>> :
    RecyclerView.Adapter<VH>(),
    DiffAdapter {

    var items: List<M> by Delegates.observable(emptyList()) { _, old, new ->
        this@BaseAdapter.notifyDiff(old, new)
    }

    override fun getItemViewType(position: Int) = items[position].layoutId
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bindItem(items[position])
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
}
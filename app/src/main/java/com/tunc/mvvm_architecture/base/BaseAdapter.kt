package com.tunc.mvvm_architecture.base

import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.tunc.mvvm_architecture.utils.DiffAdapter
import kotlin.properties.Delegates

abstract class BaseAdapter<M : RecyclerItem, VH : BaseViewHolder<M>>
    : RecyclerView.Adapter<VH>(), DiffAdapter {

    private var onItemClick: ((M) -> Unit) = {}

    private var onViewClick: ((M, View) -> Unit) = { _, _ -> }

    var items: List<M> by Delegates.observable(emptyList()) { _, old, new ->
        this@BaseAdapter.notifyDiff(old, new)
    }
    @LayoutRes
    override fun getItemViewType(position: Int) =
        items[position].layoutId

    override fun onBindViewHolder(holder: VH, position: Int) =
        holder.setOnViewClick(onViewClick)
            .bindItem(items[position], onItemClick)

    override fun getItemCount() = items.size

    fun onItemClick(onClick: ((M) -> Unit)): BaseAdapter<M, *> {
        this.onItemClick = onClick
        return this
    }

    fun onViewClick(onClick: ((M, View) -> Unit)): BaseAdapter<M, *> {
        this.onViewClick = onClick
        return this
    }


    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH


}
package com.tunc.mvvm_architecture.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

abstract class BaseViewHolder<M : RecyclerItem> : RecyclerView.ViewHolder, LayoutContainer {

    var onViewClick: ((M, View) -> Unit) = { _, _ -> }

    constructor(parent: ViewGroup, @LayoutRes layoutId: Int) : this(
        LayoutInflater.from(parent.context).inflate(
            layoutId,
            parent,
            false
        )
    )

    constructor(itemView: View) : super(itemView)


    override val containerView: View?
        get() = this.itemView

    abstract fun bindItem(item: M)

    internal fun bindItem(item: M, onItemClick: (M) -> Unit) {
        with(itemView) {
            setOnClickListener { onItemClick(item) }
            bindItem(item)
        }
    }

    internal fun setOnViewClick(onViewClick: ((M, View) -> Unit)): BaseViewHolder<M> {
        this.onViewClick = onViewClick
        return this
    }
}


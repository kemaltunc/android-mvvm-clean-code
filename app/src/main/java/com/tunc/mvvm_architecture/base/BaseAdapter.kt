package com.tunc.mvvm_architecture.base

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseAdapter<M : BaseModel, VH : BaseViewHolder<M, ViewDataBinding>> :
    ListAdapter<M, VH>(DiffCallback<M>()) {

    override fun getItemViewType(position: Int) = getItem(position).layoutId
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bindItem(getItem(position))
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
    override fun getItemId(position: Int) = getItem(position).hashCode().toLong()


    @SuppressLint("DiffUtilEquals")
    protected class DiffCallback<M : BaseModel> : DiffUtil.ItemCallback<M>() {
        override fun areItemsTheSame(oldItem: M, newItem: M) = oldItem.hashCode() == newItem.hashCode()
        override fun areContentsTheSame(oldItem: M, newItem: M) = oldItem == newItem
    }
}


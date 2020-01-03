package com.tunc.mvvm_architecture.presentation.adapter

import android.app.Activity
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.tunc.mvvm_architecture.base.BaseAdapter
import com.tunc.mvvm_architecture.base.BaseModel
import com.tunc.mvvm_architecture.base.BaseViewHolder
import com.tunc.mvvm_architecture.presentation.ui.main.ItemCallback
import com.tunc.mvvm_architecture.presentation.view_holder.PostViewHolder

class PostAdapter constructor(private val activity: Activity, private val itemCallback: ItemCallback) : BaseAdapter<BaseModel, BaseViewHolder<BaseModel, ViewDataBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            PostViewHolder.LAYOUT_ID -> PostViewHolder(parent, activity, itemCallback)
            else -> PostViewHolder(parent, activity, itemCallback)
        } as BaseViewHolder<BaseModel, ViewDataBinding>



}

package com.tunc.mvvm_architecture.presentation.adapter

import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tunc.mvvm_architecture.base.BaseAdapter
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.base.BaseModel
import com.tunc.mvvm_architecture.base.BaseViewHolder
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivityViewModel
import com.tunc.mvvm_architecture.presentation.view_holder.PostViewHolder
import com.tunc.mvvm_architecture.utils.extensions.vertical

class PostAdapter : BaseAdapter<BaseModel, BaseViewHolder<BaseModel, Any>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            PostViewHolder.LAYOUT_ID -> PostViewHolder(parent)
            else -> PostViewHolder(parent)
        } as BaseViewHolder<BaseModel, Any>

}

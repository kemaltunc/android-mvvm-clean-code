package com.tunc.mvvm_architecture.presentation.view_holder

import android.util.Log
import android.view.ViewGroup
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseModel
import com.tunc.mvvm_architecture.base.BaseViewHolder
import com.tunc.mvvm_architecture.domain.model.Post

class PostViewHolder(parent: ViewGroup) : BaseViewHolder<BaseModel>(parent, LAYOUT_ID) {

    override fun bindItem(item: BaseModel) {
        Log.d("oldumuacaba", "PostViewHolder")

        item as Post


    }

    companion object {
        const val LAYOUT_ID = R.layout.cell_post_item
    }
}
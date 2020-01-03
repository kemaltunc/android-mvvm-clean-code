package com.tunc.mvvm_architecture.presentation.view_holder

import android.app.Activity
import android.view.ViewGroup
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseViewHolder
import com.tunc.mvvm_architecture.databinding.CellPostItemBinding
import com.tunc.mvvm_architecture.domain.model.Post
import com.tunc.mvvm_architecture.presentation.ui.main.ItemCallback

class PostViewHolder(parent: ViewGroup, private val activity: Activity, private val itemCallback: ItemCallback) : BaseViewHolder<Post, CellPostItemBinding>(parent, LAYOUT_ID) {
    override fun bind(item: Post, databinding: CellPostItemBinding) {
        databinding.data = item

        itemView.setOnClickListener {
            itemCallback.removeItem(adapterPosition)
        }

        databinding.executePendingBindings()

    }

    companion object {
        const val LAYOUT_ID = R.layout.cell_post_item
    }

}
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
import com.tunc.mvvm_architecture.presentation.view_holder.ProfileViewHolder
import com.tunc.mvvm_architecture.utils.extensions.onInit

class PostAdapter : BaseAdapter<BaseModel, BaseViewHolder<BaseModel>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            PostViewHolder.LAYOUT_ID -> PostViewHolder(parent)
            ProfileViewHolder.LAYOUT_ID -> ProfileViewHolder(parent)
            else -> PostViewHolder(parent)
        }

}

@BindingAdapter(value = ["users", "viewmodel"])
fun setPost(
    view: RecyclerView,
    items: List<BaseModel>,
    vm: MainScreenActivityViewModel<BaseInterfaces>
) {
    view.adapter?.onInit(
        recyclerView = view
    )?.run {
        if (this is PostAdapter) this.items = items
    } ?: run {
        PostAdapter().apply { view.adapter = this }.items
    }
}

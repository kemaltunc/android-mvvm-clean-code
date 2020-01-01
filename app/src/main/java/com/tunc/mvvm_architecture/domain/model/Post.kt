package com.tunc.mvvm_architecture.domain.model

import com.tunc.mvvm_architecture.base.BaseModel
import com.tunc.mvvm_architecture.presentation.view_holder.PostViewHolder

data class Post(
    var id: String? = "",
    var title: String? = ""
) : BaseModel(PostViewHolder.LAYOUT_ID)
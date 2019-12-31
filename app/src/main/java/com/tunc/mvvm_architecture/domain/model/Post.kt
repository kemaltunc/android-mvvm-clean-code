package com.tunc.mvvm_architecture.domain.model

import com.tunc.mvvm_architecture.base.BaseModel
import com.tunc.mvvm_architecture.presentation.view_holder.PostViewHolder
import com.tunc.mvvm_architecture.presentation.view_holder.ProfileViewHolder

data class Post(
    var id: String? = "",
    var title: String? = "",
    var body: String? = "bodybodybody"
) : BaseModel(PostViewHolder.LAYOUT_ID)

data class User(
    var id: String? = "",
    var name: String? = "",
    var surname: String? = "bodybodybody"
) : BaseModel(ProfileViewHolder.LAYOUT_ID)


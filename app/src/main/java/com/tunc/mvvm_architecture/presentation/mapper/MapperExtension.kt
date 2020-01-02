package com.tunc.mvvm_architecture.presentation.mapper

import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import com.tunc.mvvm_architecture.domain.model.Post

fun TodoResponse.toPost() = Post(
    id = this.id,
    title = this.title
)
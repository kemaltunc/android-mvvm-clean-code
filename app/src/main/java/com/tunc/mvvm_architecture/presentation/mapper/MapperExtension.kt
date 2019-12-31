package com.tunc.mvvm_architecture.presentation.mapper

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.domain.model.Post


fun PostResponse.toPost() = Post(
    body = body
)



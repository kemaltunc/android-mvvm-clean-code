package com.tunc.mvvm_architecture.domain.usecase.Post

import com.tunc.mvvm_architecture.base.BaseResponseCallback
import com.tunc.mvvm_architecture.base.ApiRequest
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import com.tunc.mvvm_architecture.domain.datasource.PostDataSource
import javax.inject.Inject


class PostUseCase @Inject constructor(private val postDataSource: PostDataSource) {
    fun getTodos(callback: BaseResponseCallback<List<TodoResponse>>) {
        ApiRequest().execute(postDataSource.getTodos(), callback)
    }
}


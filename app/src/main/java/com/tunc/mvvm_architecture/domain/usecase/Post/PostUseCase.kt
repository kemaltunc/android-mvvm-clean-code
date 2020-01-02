package com.tunc.mvvm_architecture.domain.usecase.Post

import com.tunc.mvvm_architecture.base.BaseResponseCallback
import com.tunc.mvvm_architecture.base.BaseService
import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import com.tunc.mvvm_architecture.domain.datasource.PostDataSource
import javax.inject.Inject


class PostUseCase @Inject constructor(private val postDataSource: PostDataSource) : BaseService() {

    fun getTodos(callback: BaseResponseCallback<List<TodoResponse>>) {
        Request<List<TodoResponse>>().execute(postDataSource.getTodos(), callback)
    }

    fun getSingleTodo(todoId: String, callback: BaseResponseCallback<TodoResponse>) {
        Request<TodoResponse>().execute(postDataSource.getSingleTodo(todoId), callback)
    }
}


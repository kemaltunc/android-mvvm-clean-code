package com.tunc.mvvm_architecture.data.remote.repository

import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import com.tunc.mvvm_architecture.data.remote.services.PostServices
import com.tunc.mvvm_architecture.domain.repository.PostRepository
import io.reactivex.Single


class PostRepositoryImp(private val postServices: PostServices) : PostRepository {
    override fun getTodos(): Single<List<TodoResponse>> = postServices.getTodos()
    override fun getSingleTodo(todoId: String) = postServices.getSingleTodo(todoId)
}

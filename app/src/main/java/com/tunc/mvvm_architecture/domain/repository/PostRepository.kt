package com.tunc.mvvm_architecture.domain.repository

import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import io.reactivex.Single

interface PostRepository {
    fun getTodos(): Single<List<TodoResponse>>
    fun getSingleTodo(todoId: String): Single<TodoResponse>
}
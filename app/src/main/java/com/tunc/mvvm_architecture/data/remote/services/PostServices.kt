package com.tunc.mvvm_architecture.data.remote.services

import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PostServices {
    @GET("todos")
    fun getTodos(): Single<List<TodoResponse>>

    @GET("todos/")
    fun getSingleTodo(@Query("todoId") todoId: String): Single<TodoResponse>
}
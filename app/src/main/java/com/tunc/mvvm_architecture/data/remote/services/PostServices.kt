package com.tunc.mvvm_architecture.data.remote.services

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PostServices {
    @GET("post")
    fun getPost(@Query("id") postId: String): Observable<PostResponse>

    @GET("todos")
    fun getTodos(): Single<List<PostResponse>>
}
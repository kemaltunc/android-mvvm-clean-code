package com.tunc.mvvm_architecture.data.remote.services

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface PostServices {
    @GET("feed/getFeed")
    fun getPost(@Query("postId") postId: String): Observable<PostResponse>
}
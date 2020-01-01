package com.tunc.mvvm_architecture.domain.repository

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import io.reactivex.Observable
import io.reactivex.Single

interface PostRepository {
    fun getPost(postId: String): Observable<PostResponse>
    fun getTodos(): Single<List<PostResponse>>
}
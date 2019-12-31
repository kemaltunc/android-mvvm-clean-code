package com.tunc.mvvm_architecture.domain.repository

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import io.reactivex.Observable

interface PostRepository {
    fun getPost(postId: String): Observable<PostResponse>
}
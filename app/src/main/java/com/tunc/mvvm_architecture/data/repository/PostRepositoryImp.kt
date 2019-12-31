package com.tunc.mvvm_architecture.data.repository

import com.tunc.mvvm_architecture.base.BaseResponse
import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.data.remote.services.PostServices
import com.tunc.mvvm_architecture.domain.repository.PostRepository
import io.reactivex.Observable

class PostRepositoryImp(private val postApi: PostServices) : PostRepository {
    override fun getPost(postId: String): Observable<PostResponse> {
        return postApi.getPost(postId)
    }

}
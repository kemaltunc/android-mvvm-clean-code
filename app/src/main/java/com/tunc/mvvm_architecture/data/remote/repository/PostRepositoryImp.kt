package com.tunc.mvvm_architecture.data.remote.repository

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.data.remote.services.PostServices
import com.tunc.mvvm_architecture.domain.repository.PostRepository
import io.reactivex.Observable
import io.reactivex.Single


class PostRepositoryImp(private val postServices: PostServices) : PostRepository {
    override fun getPost(postId: String): Observable<PostResponse> = postServices.getPost(postId)
    override fun getTodos(): Single<List<PostResponse>> = postServices.getTodos()
}

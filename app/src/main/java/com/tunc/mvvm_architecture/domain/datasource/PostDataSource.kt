package com.tunc.mvvm_architecture.domain.datasource

import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.data.repository.PostRepositoryImp
import com.tunc.mvvm_architecture.domain.repository.PostRepository
import io.reactivex.Observable

class PostDataSource constructor(private val repository: PostRepositoryImp) : PostRepository {
    override fun getPost(postId: String): Observable<PostResponse> {
        return repository.getPost(postId)
    }

}
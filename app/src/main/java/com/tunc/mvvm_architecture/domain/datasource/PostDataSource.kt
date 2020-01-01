package com.tunc.mvvm_architecture.domain.datasource

import com.tunc.mvvm_architecture.domain.repository.PostRepository
import javax.inject.Inject

class PostDataSource @Inject constructor(private val postRepository: PostRepository) {

    fun getData() = postRepository.getPost("1234")
    fun getTodos() = postRepository.getTodos()
}
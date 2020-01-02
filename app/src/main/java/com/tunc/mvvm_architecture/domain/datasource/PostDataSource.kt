package com.tunc.mvvm_architecture.domain.datasource

import com.tunc.mvvm_architecture.domain.repository.PostRepository
import javax.inject.Inject

class PostDataSource @Inject constructor(private val postRepository: PostRepository) {
    fun getTodos() = postRepository.getTodos()
    fun getSingleTodo(todoId: String) = postRepository.getSingleTodo(todoId)
}
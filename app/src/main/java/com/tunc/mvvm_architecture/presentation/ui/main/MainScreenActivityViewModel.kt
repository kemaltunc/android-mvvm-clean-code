package com.tunc.mvvm_architecture.presentation.ui.main

import androidx.lifecycle.MutableLiveData
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.base.BaseResponseCallback
import com.tunc.mvvm_architecture.base.BaseViewModel
import com.tunc.mvvm_architecture.data.model.response.TodoResponse
import com.tunc.mvvm_architecture.domain.model.Post
import com.tunc.mvvm_architecture.domain.usecase.Post.PostUseCase
import com.tunc.mvvm_architecture.presentation.mapper.toPost
import javax.inject.Inject

class MainScreenActivityViewModel<I : BaseInterfaces> @Inject constructor(private val postUseCase: PostUseCase) : BaseViewModel<I>() {

    val postLiveData = MutableLiveData<List<Post>>()


    fun selectedTodo(position: Int) {
        postLiveData.value?.get(position)?.isSelected = true
    }

    fun getTodos() {
        postUseCase.getTodos(object :
            BaseResponseCallback<List<TodoResponse>>(interfaces) {
            override fun onSuccess(response: List<TodoResponse>?) {
                super.onSuccess(response)
                postLiveData.value = response?.map {
                    it.toPost()
                }
            }
        })

    }
}


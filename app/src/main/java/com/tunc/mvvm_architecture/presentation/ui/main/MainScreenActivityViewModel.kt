package com.tunc.mvvm_architecture.presentation.ui.main

import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.base.BaseResponseCallback
import com.tunc.mvvm_architecture.base.BaseViewModel
import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.domain.usecase.Post.PostUseCase
import javax.inject.Inject

class MainScreenActivityViewModel<I : BaseInterfaces> @Inject constructor(private val postUseCase: PostUseCase) :
    BaseViewModel<I>() {

    fun deneme() {
        interfaces.showMessage("okeymi")
        /*interfaces.showMessage("ok")
        postUseCase.getPost("234", object : BaseResponseCallback<PostResponse>(interfaces) {
            override fun onSuccess(response: PostResponse?) {
                super.onSuccess(response)

            }
        })
*/

    }

}
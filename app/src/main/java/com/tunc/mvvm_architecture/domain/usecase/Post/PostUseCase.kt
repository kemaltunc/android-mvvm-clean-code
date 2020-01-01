package com.tunc.mvvm_architecture.domain.usecase.Post

import com.tunc.mvvm_architecture.base.BaseResponseCallback
import com.tunc.mvvm_architecture.base.BaseServiceImp
import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.domain.datasource.PostDataSource
import javax.inject.Inject


class PostUseCase @Inject constructor(private val postDataSource: PostDataSource) :
    BaseServiceImp() {

    fun getTodos(callback: BaseResponseCallback<List<PostResponse>>) {
        Request<List<PostResponse>>().execute(postDataSource.getTodos(), callback)
    }
}


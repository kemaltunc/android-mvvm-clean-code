package com.tunc.mvvm_architecture.domain.usecase.Post

import android.util.Log
import com.tunc.mvvm_architecture.base.BaseResponseCallback
import com.tunc.mvvm_architecture.base.BaseServiceImp
import com.tunc.mvvm_architecture.data.model.response.PostResponse
import com.tunc.mvvm_architecture.domain.datasource.PostDataSource
import javax.inject.Inject

/*
class PostUseCase @Inject constructor(private val postDataSource: PostDataSource) :
    BaseServiceImp() {

    fun getPost(postId: String, callback: BaseResponseCallback<PostResponse>) =
        getRequest({ postDataSource.getPost(postId) }, callback)
}
*/
 class PostUseCase {
    fun getPost(postId: String, callback: BaseResponseCallback<PostResponse>) {
        Log.d("oldumu","ok")
    }
}

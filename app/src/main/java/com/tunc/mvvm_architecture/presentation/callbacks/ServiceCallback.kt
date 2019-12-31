package com.tunc.mvvm_architecture.presentation.callbacks

import com.tunc.mvvm_architecture.data.model.ErrorModel

interface ServiceCallback<T> {

    fun onSuccess(response: T?)
    fun onError(errorCode: Int, errorMessage: String)
}
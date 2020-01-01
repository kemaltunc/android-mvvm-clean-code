package com.tunc.mvvm_architecture.base

import com.tunc.mvvm_architecture.presentation.callbacks.ServiceCallback

abstract class BaseResponseCallback<R> constructor(
    private val callback: BaseInterfaces
) : ServiceCallback<R> {

    override fun onSuccess(response: R?) {

    }

    override fun onError(errorCode: Int, errorMessage: String) {
        callback.showMessage(errorMessage)
    }
}

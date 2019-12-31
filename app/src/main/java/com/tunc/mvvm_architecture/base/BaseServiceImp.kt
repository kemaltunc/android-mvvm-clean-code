package com.tunc.mvvm_architecture.base

import com.tunc.mvvm_architecture.data.remote.ApiErrorHandle
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

abstract class BaseServiceImp {
    fun <T> getRequest(
        observable: () -> Observable<T>,
        callback: BaseResponseCallback<T>
    ): Disposable = observable()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(onNext(callback)) {
            ApiErrorHandle.traceErrorException(it)
                .let { trace -> callback.onError(trace.code!!, trace.message!!) }
        }

    private fun <T> onNext(callback: BaseResponseCallback<T>): (T) -> Unit = { result ->
        callback.onSuccess(result)
    }
}


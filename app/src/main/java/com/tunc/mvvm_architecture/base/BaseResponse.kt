package com.tunc.mvvm_architecture.base


class BaseResponse<T> {

    var code: Int = 0
        private set
    var data: T? = null
        private set

    var error: String? = null
        private set

}


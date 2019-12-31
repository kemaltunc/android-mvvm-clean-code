package com.tunc.mvvm_architecture.utils


enum class HttpResponseCodes(var code: Int) {
    SUCCESS_CODE(200),
    UNAUTHORIZED_CODE(401),
    INTERNAL_SERVER_CODE(500),
    SERVER_ERROR_CODE(510)
}
package com.tunc.mvvm_architecture.utils

class AppConstants {
    companion object {
        const val CACHE_SIZE: Long = 10 * 1024 * 1024
        const val MAX_STALE: Int = 60 * 60 * 24 * 28

        const val CONNECT_TIME_OUT: Long = 30L
        const val READ_TIME_OUT: Long = 30L
        const val WRITE_TIME_OUT: Long = 30L


    }
}

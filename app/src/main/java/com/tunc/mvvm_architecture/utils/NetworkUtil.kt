package com.tunc.mvvm_architecture.utils

import android.content.Context
import android.net.ConnectivityManager
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor

fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}

fun CacheInterceptor(context: Context): Interceptor {
    return object : Interceptor {
        override fun intercept(chain: Interceptor.Chain): Response {
            val request = chain.request().newBuilder()
                .addHeader("Authorization", "")
                .build()

            if (!isNetworkAvailable(context)) {
                val maxStale = AppConstants.MAX_STALE
                return chain.proceed(
                    chain.request().newBuilder()
                        .header(
                            "Cache-Control",
                            "public, only-if-cached, max-stale=$maxStale"
                        )
                        .build()
                )
            }
            return chain.proceed(request)
        }
    }

}

fun LoggingIterceptor(): Interceptor {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

    return loggingInterceptor
}
package com.tunc.mvvm_architecture.di.modules

import android.content.Context
import com.tunc.mvvm_architecture.BuildConfig
import com.tunc.mvvm_architecture.utils.AppConstants
import com.tunc.mvvm_architecture.utils.CacheInterceptor
import com.tunc.mvvm_architecture.utils.LoggingIterceptor
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(context: Context) = OkHttpClient.Builder()
        .readTimeout(AppConstants.READ_TIME_OUT, TimeUnit.SECONDS)
        .connectTimeout(AppConstants.CONNECT_TIME_OUT, TimeUnit.SECONDS)
        .cache(Cache(context.cacheDir, AppConstants.CACHE_SIZE))
        .addInterceptor(CacheInterceptor(context))
        .addInterceptor(LoggingIterceptor())
        .build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
        .baseUrl("")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()
}
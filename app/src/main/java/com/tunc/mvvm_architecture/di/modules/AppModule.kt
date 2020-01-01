package com.tunc.mvvm_architecture.di.modules

import android.app.Application
import android.content.Context
import com.tunc.mvvm_architecture.MainApplication
import com.tunc.mvvm_architecture.domain.usecase.Post.PostUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: MainApplication): Application = app

    @Provides
    @Singleton
    fun provideApplicationContext(app: MainApplication): Context = app.applicationContext


    @Provides
    @Singleton
    fun providePostUseCase() = PostUseCase()
}
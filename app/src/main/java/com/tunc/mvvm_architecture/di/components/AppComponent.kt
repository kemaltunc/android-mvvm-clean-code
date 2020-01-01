package com.tunc.mvvm_architecture.di.components

import com.tunc.mvvm_architecture.MainApplication
import com.tunc.mvvm_architecture.di.modules.ActivityInjectorModules
import com.tunc.mvvm_architecture.di.modules.AppModule
import com.tunc.mvvm_architecture.di.modules.NetworkModule
import com.tunc.mvvm_architecture.di.modules.ViewModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityInjectorModules::class,
        NetworkModule::class,
        ViewModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: MainApplication): Builder

        fun build(): AppComponent

    }

    fun inject(app: MainApplication)
}
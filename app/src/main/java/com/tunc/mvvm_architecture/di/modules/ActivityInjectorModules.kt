package com.tunc.mvvm_architecture.di.modules

import com.tunc.mvvm_architecture.di.scopes.ActivityScope
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityInjectorModules {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun mainScreenActivityActivityInjector(): MainScreenActivity
}
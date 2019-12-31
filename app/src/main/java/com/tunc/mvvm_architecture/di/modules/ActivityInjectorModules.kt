package com.tunc.mvvm_architecture.di.modules

import com.tunc.mvvm_architecture.di.modules.activities.MainScreenActivityModule
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityInjectorModules {

    @ContributesAndroidInjector(modules = [MainScreenActivityModule::class])
    abstract fun mainScreenActivityActivityInjector(): MainScreenActivity

}
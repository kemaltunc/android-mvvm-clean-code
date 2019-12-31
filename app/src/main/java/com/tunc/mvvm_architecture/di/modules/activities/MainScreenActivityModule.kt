package com.tunc.mvvm_architecture.di.modules.activities

import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.di.InjectionViewModelProvider
import com.tunc.mvvm_architecture.di.qualifers.ViewModelInjection
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivity
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivityViewModel
import dagger.Module
import dagger.Provides

@Module
class MainScreenActivityModule {
    @Provides
    @ViewModelInjection
    fun provideMainScreenActivityVM(
        activity: MainScreenActivity,
        viewModelProvider: InjectionViewModelProvider<MainScreenActivityViewModel<BaseInterfaces>>
    ) = viewModelProvider.get(activity)
}
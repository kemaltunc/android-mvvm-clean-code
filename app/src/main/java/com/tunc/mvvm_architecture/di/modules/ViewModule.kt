package com.tunc.mvvm_architecture.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.artgallery.presentation.ViewModelFactory
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.di.ViewModelKey
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainScreenActivityViewModel::class)
    internal abstract fun mainScreenViewModel(viewModel: MainScreenActivityViewModel<BaseInterfaces>): ViewModel
}
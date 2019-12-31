package com.tunc.mvvm_architecture.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.di.qualifers.ViewModelFactory
import com.tunc.mvvm_architecture.di.qualifers.ViewModelKey
import com.tunc.mvvm_architecture.presentation.ui.main.MainScreenActivityViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton
import kotlin.reflect.KClass



@Module
abstract class ViewModelFactory {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainScreenActivityViewModel::class)
    internal abstract fun postListViewModel(viewModel: MainScreenActivityViewModel<BaseInterfaces>): ViewModel

    //Add more ViewModels here
}
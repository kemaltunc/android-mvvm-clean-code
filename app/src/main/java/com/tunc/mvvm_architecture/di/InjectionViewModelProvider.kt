package com.tunc.mvvm_architecture.di

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

typealias ViewModelInjectionField<T> = dagger.Lazy<T>

@Suppress("UNCHECKED_CAST")
class InjectionViewModelProvider<VM : ViewModel> @Inject constructor(
    private val lazyViewModel: dagger.Lazy<VM>,
    private val viewModel: VM
) {

    @Suppress("UNCHECKED_CAST")
    private val viewModelFactory = object : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>) = lazyViewModel.get() as T
    }


    /*fun <ACTIVITY : FragmentActivity, VM : ViewModel> get(
        activity: ACTIVITY,
        viewModelClass: VM
    ) = ViewModelProviders.of(activity, viewModelFactory).get((viewModelClass).javaClass)
*/
    /*fun <FRAGMENT : Fragment> get(
        fragment: FRAGMENT,
        viewModelClass: BaseViewModel<BaseInterfaces>
    ) = ViewModelProviders.of(fragment, viewModelFactory).get((viewModelClass as VM).javaClass)*/


    fun <ACTIVITY : FragmentActivity> get(
        activity: ACTIVITY
    ) = ViewModelProviders.of(activity, viewModelFactory).get((viewModel).javaClass)


}
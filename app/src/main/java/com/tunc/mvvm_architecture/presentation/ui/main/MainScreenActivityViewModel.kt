package com.tunc.mvvm_architecture.presentation.ui.main

import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.base.BaseViewModel
import dagger.Module
import javax.inject.Inject

class MainScreenActivityViewModel<I : BaseInterfaces> @Inject constructor() : BaseViewModel<I>() {

    fun deneme() {
        interfaces.showMessage("ok")


    }

}
package com.tunc.mvvm_architecture.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<I : BaseInterfaces> : ViewModel() {
    lateinit var interfaces: BaseInterfaces

    fun onAttach(callback: I) {
        this.interfaces = callback
    }
}
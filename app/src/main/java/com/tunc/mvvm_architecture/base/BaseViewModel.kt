package com.tunc.mvvm_architecture.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<CI : BaseInterfaces> : ViewModel() {
    lateinit var interfaces: BaseInterfaces

    fun onAttach(callback: CI) {
        this.interfaces = callback
    }
}
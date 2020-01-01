package com.tunc.mvvm_architecture.presentation.ui.main

import android.os.Bundle
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseActivity
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.databinding.ActivityMainScreenBinding

class MainScreenActivity :
    BaseActivity<ActivityMainScreenBinding, MainScreenActivityViewModel<BaseInterfaces>>(
        MainScreenActivityViewModel()
    ) {

    override fun layoutRes() = R.layout.activity_main_screen


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.deneme()
    }
}

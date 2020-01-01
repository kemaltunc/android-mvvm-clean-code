package com.tunc.mvvm_architecture.presentation.ui.main

import android.os.Bundle
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseActivity
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.databinding.ActivityMainScreenBinding
import kotlin.reflect.KClass

class MainScreenActivity : BaseActivity<ActivityMainScreenBinding, MainScreenActivityViewModel<BaseInterfaces>>() {


    override fun layoutRes() = R.layout.activity_main_screen

    override fun model()= MainScreenActivityViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.deneme()
    }
}

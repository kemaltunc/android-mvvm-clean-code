package com.tunc.mvvm_architecture.presentation.ui.main

import android.os.Bundle
import androidx.lifecycle.Observer
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseActivity
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.databinding.ActivityMainScreenBinding
import com.tunc.mvvm_architecture.presentation.adapter.PostAdapter
import com.tunc.mvvm_architecture.utils.extensions.vertical
import kotlinx.android.synthetic.main.activity_main_screen.*

@Suppress("UNREACHABLE_CODE")
class MainScreenActivity :
    BaseActivity<ActivityMainScreenBinding, MainScreenActivityViewModel<BaseInterfaces>>() {


    override fun layoutRes() = R.layout.activity_main_screen

    override fun model() = MainScreenActivityViewModel::class.java

    val postAdapter by lazy { PostAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getTodos()

        postAdapter.vertical(
            recycler_list
        )

        viewModel.postLiveData.observe(this, Observer {
            postAdapter.items = it
        })
    }

}

package com.tunc.mvvm_architecture.presentation.ui.main

import android.os.Bundle
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseActivity
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.databinding.ActivityMainScreenBinding
import com.tunc.mvvm_architecture.domain.model.Post
import com.tunc.mvvm_architecture.presentation.adapter.PostAdapter
import com.tunc.mvvm_architecture.presentation.mapper.toPost
import com.tunc.mvvm_architecture.presentation.view_holder.ProfileViewHolder
import com.tunc.mvvm_architecture.utils.extensions.onInit
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreenActivity :
    BaseActivity<ActivityMainScreenBinding, MainScreenActivityViewModel<BaseInterfaces>>() {

    override fun layoutRes() = R.layout.activity_main_screen

    private val postadapter by lazy { PostAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewModel.deneme()
    }
}

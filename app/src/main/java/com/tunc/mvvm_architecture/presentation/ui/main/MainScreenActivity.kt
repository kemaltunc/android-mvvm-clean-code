package com.tunc.mvvm_architecture.presentation.ui.main

import android.os.Bundle
import androidx.lifecycle.Observer
import com.tunc.mvvm_architecture.R
import com.tunc.mvvm_architecture.base.BaseActivity
import com.tunc.mvvm_architecture.base.BaseInterfaces
import com.tunc.mvvm_architecture.base.BaseModel
import com.tunc.mvvm_architecture.databinding.ActivityMainScreenBinding
import com.tunc.mvvm_architecture.presentation.adapter.PostAdapter
import com.tunc.mvvm_architecture.utils.extensions.vertical
import kotlinx.android.synthetic.main.activity_main_screen.*


@Suppress("UNREACHABLE_CODE")
class MainScreenActivity : BaseActivity<ActivityMainScreenBinding, MainScreenActivityViewModel<BaseInterfaces>>(), ItemCallback {


    override fun layoutRes() = R.layout.activity_main_screen

    override fun model() = MainScreenActivityViewModel::class.java

    val postAdapter by lazy { PostAdapter(this, this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getTodos()

        postAdapter.vertical(
            recyclerView = recycler_list,
            animation = false
        )

        viewModel.postLiveData.observe(this, Observer<List<BaseModel>> {
            postAdapter.submitList(it)
        })

    }


    override fun removeItem(position: Int) {
        viewModel.selectedTodo(position)/*
        postAdapter.notifyItemChanged(position)*/
    }

}

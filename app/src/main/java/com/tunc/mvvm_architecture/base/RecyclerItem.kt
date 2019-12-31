package com.tunc.mvvm_architecture.base

import androidx.annotation.LayoutRes
import java.io.Serializable

interface RecyclerItem : Serializable {

    @get:LayoutRes
    val layoutId: Int
}
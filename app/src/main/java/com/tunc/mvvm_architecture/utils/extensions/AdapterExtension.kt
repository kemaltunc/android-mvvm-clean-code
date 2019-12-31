package com.tunc.mvvm_architecture.utils.extensions

import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.*

@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.onInit(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    dividerItemDecoration: Int? = DividerItemDecoration.VERTICAL,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager = layoutManager ?: LinearLayoutManager(context)
        adapter = this@onInit
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, dividerItemDecoration!!).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}

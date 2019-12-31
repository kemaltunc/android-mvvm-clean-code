package com.tunc.mvvm_architecture.base

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.tunc.mvvm_architecture.di.ViewModelInjectionField
import com.tunc.mvvm_architecture.di.qualifers.ViewModelInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity<T : ViewDataBinding, VM : BaseViewModel<BaseInterfaces>> :
    DaggerAppCompatActivity(),
    BaseInterfaces {

    @LayoutRes
    abstract fun layoutRes(): Int

    @Inject
    @ViewModelInjection
    lateinit var injectModel: ViewModelInjectionField<VM>

    protected lateinit
    var binding: T
        private set

    protected lateinit var viewModel: VM
        private set


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutRes())
        injectModel.get().onAttach(this)

        viewModel = injectModel.get()


    }

    override fun showMessage(message: String) {
        Toast.makeText(this@BaseActivity, message, Toast.LENGTH_LONG).show()
    }

}

/*protected lateinit var viewModel: MainScreenActivityViewModel<*>
    private set

viewModel =
ViewModelProviders.of(
this,
viewModelFactory
)[MainScreenActivityViewModel::class.java]*/

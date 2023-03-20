package com.myapplication.di.auth

import androidx.lifecycle.ViewModel
import com.myapplication.di.ViewModelKey
import com.myapplication.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(viewModel: AuthViewModel):ViewModel

}
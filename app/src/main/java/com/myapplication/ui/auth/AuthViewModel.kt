package com.myapplication.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import com.myapplication.network.auth.AuthApi
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val authApi: AuthApi) : ViewModel(){


    fun check(){
        Log.d("viewModel Working","ViewModelWorking")

        if (authApi == null){
            Log.d("Auth Api","Auth Api is null")
        }else{
            Log.d("Auth Api","Auth Api is not null")
        }
    }
}
package com.myapplication.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class AuthViewModel @Inject constructor() : ViewModel(){
    fun check(){
        Log.d("viewModel Working","ViewModelWorking")
    }
}
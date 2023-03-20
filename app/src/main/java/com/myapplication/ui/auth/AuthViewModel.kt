package com.myapplication.ui.auth

import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myapplication.models.User
import com.myapplication.network.auth.AuthApi
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val authApi: AuthApi) : ViewModel(){


     fun check(){
        Log.d("viewModel Working","ViewModelWorking")
         viewModelScope.launch {
             getUser()
         }

    }

    private fun getUser(){
        authApi.run {
            getUser(1)
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe({response -> handleResponse(response)}, {t -> onFailure(t) })
        }
    }

    private fun onFailure(t: Throwable) {
        Log.d("viewModel Working","Failed to get Data")
    }
    private fun handleResponse(user: User){
        Log.d("viewModel Working",user.email)
    }
}
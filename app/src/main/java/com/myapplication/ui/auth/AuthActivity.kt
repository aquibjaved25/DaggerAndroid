package com.myapplication.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.myapplication.databinding.ActivityAuthBinding
import com.myapplication.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    //Its for viewBinding
    private lateinit var binding: ActivityAuthBinding
    private lateinit var authVewModel: AuthViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Its for viewBinding
        binding = ActivityAuthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        authVewModel = ViewModelProvider(this, providerFactory)[AuthViewModel::class.java]
        authVewModel.check()
        setLogo()

    }

    private fun setLogo() {
        requestManager.load(logo).into(binding.loginLogo)
    }
}
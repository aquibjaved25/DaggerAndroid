package com.myapplication

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.RequestManager
import com.myapplication.databinding.ActivityAuthBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    //Its for viewBinding
    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Its for viewBinding
        binding = ActivityAuthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setLogo()

    }

    private fun setLogo() {
        requestManager.load(logo).into(binding.loginLogo)
    }
}
package com.myapplication.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.myapplication.R
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    companion object {
        @Singleton
        @Provides
        fun provideRequestOptions(): RequestOptions = RequestOptions()
            .placeholder(R.drawable.white_background)
            .error(R.drawable.white_background)
        @Singleton
        @Provides
        fun provideGlideInstance(application: Application,requestOptions: RequestOptions) = Glide.with(application).setDefaultRequestOptions(requestOptions)
        @Singleton
        @Provides
        fun provideAppDrawable(application: Application):Drawable =
            ContextCompat.getDrawable(application,R.drawable.logo)!!
    }
}
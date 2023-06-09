package com.myapplication.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.myapplication.R
import com.myapplication.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    companion object {

        @Singleton
        @Provides
        fun provideRetrofitInstance() : Retrofit {
            return Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
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
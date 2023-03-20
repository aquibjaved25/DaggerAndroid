package com.myapplication.di.auth

import com.myapplication.network.auth.AuthApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class AuthModule {

    companion object {

        @Provides
        fun provideAuthApi(retrofit: Retrofit): AuthApi =retrofit.create(AuthApi::class.java)

    }

}
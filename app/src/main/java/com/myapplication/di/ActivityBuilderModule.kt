package com.myapplication.di

import com.myapplication.di.auth.AuthViewModelsModule
import com.myapplication.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [AuthViewModelsModule::class])
    abstract fun contributeAuthActivity(): AuthActivity

}
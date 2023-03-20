package com.myapplication.network.auth

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface AuthApi {

    @GET
    suspend fun getFakeStuff() : Call<ResponseBody>

}
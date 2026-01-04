package com.programmingkeeda.mvvm_demo.NetworkModul

import com.programmingkeeda.mvvm_demo.NetworkModul.APIInterface.PostAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL="https://jsonplaceholder.typicode.com/"

    val api: PostAPI by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PostAPI::class.java)
    }
}
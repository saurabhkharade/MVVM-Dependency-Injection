package com.programmingkeeda.mvvm_demo.APIInterface

import com.programmingkeeda.mvvm_demo.Model.Post
import retrofit2.http.GET

interface PostApi {

    @GET("post")
    suspend fun getPost(): List<Post>
}
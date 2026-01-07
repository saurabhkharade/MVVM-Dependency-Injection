package com.programmingkeeda.mvvm_demo.NetworkModul.APIInterface

import com.programmingkeeda.mvvm_demo.Model.Post
import retrofit2.http.GET

interface PostAPI {
    @GET("posts")
    suspend fun getPost(): List<Post>


}
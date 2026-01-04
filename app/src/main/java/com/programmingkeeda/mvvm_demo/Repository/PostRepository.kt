package com.programmingkeeda.mvvm_demo.Repository

import com.programmingkeeda.mvvm_demo.Model.Post
import com.programmingkeeda.mvvm_demo.NetworkModul.APIInterface.PostAPI

class PostRepository (private  val api: PostAPI){
    suspend fun getPosts(): List<Post>{
        return api.getPost()
    }


}
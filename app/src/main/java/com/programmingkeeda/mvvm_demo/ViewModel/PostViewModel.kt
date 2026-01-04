package com.programmingkeeda.mvvm_demo.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.programmingkeeda.mvvm_demo.Model.Post
import com.programmingkeeda.mvvm_demo.Repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel(private val repository: PostRepository) : ViewModel() {
    private val _posts = MutableLiveData<List<Post>>()
    val post: LiveData<List<Post>> = _posts

    fun fetchData() {
        viewModelScope.launch {
            val response = repository.getPosts()
            _posts.postValue(response)
        }
    }

}
package com.example.mvvmdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.model.Category

class MainViewModel: ViewModel() {
    var ist=MutableLiveData<ArrayList<Category>>()
    var newList= arrayListOf<Category>()


    fun add(category: Category){
        newList.add(category)
        ist.value=newList
    }

    fun remove(category: Category){
        newList.remove(category)
        ist.value=newList
    }
}
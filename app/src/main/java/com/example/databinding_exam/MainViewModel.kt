package com.example.databinding_exam

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val currentRandomFruitNmae : LiveData<String>
        get() = Repository.currentRandomFruitName

    fun onChnageRandomFruitClick() = Repository.changeCurrentRandomFruitName()



    val editTextContent = MutableLiveData<String>()

    private val _displayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent: LiveData<String>
        get() = _displayedEditTextContent


    fun onDisplayedEditTextContentClick(){
        _displayedEditTextContent.value = editTextContent.value
    }

    fun onSelectRandomEditTextFruit(){
        editTextContent.value = Repository.getRandomFruitName()
    }



}
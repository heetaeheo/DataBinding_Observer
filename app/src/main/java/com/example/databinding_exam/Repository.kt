package com.example.databinding_exam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object Repository {

    private val fruitNames : List<String> = listOf(
        "Apple","Banana","Orange","kiwi","Grapes","Fig","Pear","Strawberry","Gooseberry","Rasberry"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName


    init {
        _currentRandomFruitName.value = fruitNames.first()
    }

    fun getRandomFruitName() : String{
        val random = Random()
        return fruitNames[random.nextInt(fruitNames.size)]
    }

    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomFruitName()
    }



}
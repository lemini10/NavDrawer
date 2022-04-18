package com.example.navdrawer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is contacts fragment"
    }
    val text: LiveData<String> = _text
}
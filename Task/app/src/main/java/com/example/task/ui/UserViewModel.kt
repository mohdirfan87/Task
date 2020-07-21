package com.example.task.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.task.model.User

class UserViewModel() : ViewModel() {

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name
    private val _phone = MutableLiveData<String>()
    val phone: LiveData<String> = _phone
    private val _age = MutableLiveData<String>()
    val age: LiveData<String> = _age
    private val _gender = MutableLiveData<String>()
    val gender: LiveData<String> = _gender

    private val _town = MutableLiveData<String>()
    val town: LiveData<String> = _town
    private val _state = MutableLiveData<String>()
    val state: LiveData<String> = _state
    private val _pin = MutableLiveData<String>()
    val pin: LiveData<String> = _pin

    private val _bussiness = MutableLiveData<String>()
    val bussiness: LiveData<String> = _bussiness
    private val _bussiness_type = MutableLiveData<String>()
    val bussiness_type: LiveData<String> = _bussiness_type
    private val _bussiness_location = MutableLiveData<String>()
    val bussiness_location: LiveData<String> = _bussiness_location
    private val _bussiness_mail = MutableLiveData<String>()
    val bussiness_mail: LiveData<String> = _bussiness_mail


}
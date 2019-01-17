package com.example.hdev.kotlinexample

class HigherFunction(){
    fun setName(show_name : (String) -> Unit){
        show_name("Hoang")
    }
}
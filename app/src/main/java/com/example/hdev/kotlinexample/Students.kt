package com.example.hdev.kotlinexample

class Students{
    private var code = -1
    private var name = ""
    private var address = ""

    constructor(code: Int, name: String, address: String) {
        this.code = code
        this.name = name
        this.address = address
    }

    constructor()

    override fun toString(): String {
        return "Students(code=$code, name='$name', address='$address')"
    }
}
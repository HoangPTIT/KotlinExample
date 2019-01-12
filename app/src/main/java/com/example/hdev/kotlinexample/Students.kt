package com.example.hdev.kotlinexample

class Students {
    private var code = -1
    private var name = ""
    private var address = ""

    constructor(code: Int, name: String, address: String) {
        this.code = code
        this.name = name
        this.address = address
    }

    constructor()

    fun setCode(code: Int) {
        this.code = code
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setAddress(address: String) {
        this.address = address
    }

    fun getCode(): Int {
        return code
    }

    fun getName(): String {
        return name
    }

    fun getAddress(): String {
        return address
    }

    override fun toString(): String {
        return "Students(code=$code, name='$name', address='$address')"
    }
}
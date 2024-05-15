package com.example.paper4good.models

class User {
    var email: String = ""
    var password: String = ""
    var name: String = ""

    constructor(name: String, email: String, password: String, id: String) {
        this.name = name
        this.email = email
        this.password = password


    }
}
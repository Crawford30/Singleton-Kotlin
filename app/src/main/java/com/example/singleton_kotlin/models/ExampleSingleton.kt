package com.example.singleton_kotlin.models

object ExampleSingleton {
    val singletonUser:User by lazy {
        //Lazy initializer means, initialise it only once when its called the first time
        //Basically its null until its called
        User("joel@gamil.com", "joel", "image.png")
    }
}
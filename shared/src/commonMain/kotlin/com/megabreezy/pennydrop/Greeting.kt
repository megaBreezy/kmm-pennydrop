package com.megabreezy.pennydrop

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class DemoService {

    private val test = "Hello, World!"

    fun getTest(): String {
        return test
    }
}
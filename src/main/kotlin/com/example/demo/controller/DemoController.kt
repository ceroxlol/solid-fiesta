package com.example.demo.controller

import com.example.demo.service.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    private val demoService = DemoService()

    @GetMapping("/hello")
    fun hello(): String {
        return demoService.getTest()
    }
}
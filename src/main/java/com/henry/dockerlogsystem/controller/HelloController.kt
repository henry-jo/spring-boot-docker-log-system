package com.henry.dockerlogsystem.controller

import org.springframework.web.bind.annotation.RequestMapping

import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun hello() = "Hello, Spring Boot!"
}
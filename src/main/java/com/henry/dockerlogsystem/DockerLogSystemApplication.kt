package com.henry.dockerlogsystem

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DockerLogSystemApplication

fun main(args: Array<String>) {
    SpringApplication.run(DockerLogSystemApplication::class.java, *args)
}
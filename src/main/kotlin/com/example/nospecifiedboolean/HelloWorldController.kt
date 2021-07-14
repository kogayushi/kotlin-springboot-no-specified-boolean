package com.example.nospecifiedboolean

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.constraints.NotNull

@RequestMapping("/hello-world")
@RestController
class HelloWorldController {

    @GetMapping
    fun get(): String = "hello world"

    @PostMapping
    fun post(@Validated @RequestBody payload: TestDto) {

        println(payload)
    }
}

data class TestDto(
    val name: String?,
    val isMail: Boolean
)

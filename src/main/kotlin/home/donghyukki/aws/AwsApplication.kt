package home.donghyukki.aws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AwsApplication

fun main(args: Array<String>) {
    runApplication<AwsApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello() = "hello"
}

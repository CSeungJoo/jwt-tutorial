package com.cseungjoo.jwttutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JwtTutorialApplication

fun main(args: Array<String>) {
    runApplication<JwtTutorialApplication>(*args)
}

package com.github.ktj

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtjApplication

fun main(args: Array<String>) {
	runApplication<KtjApplication>(*args)
}

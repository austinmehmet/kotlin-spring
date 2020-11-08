package com.kt.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtSampleApiApplication

fun main(args: Array<String>) {
	runApplication<KtSampleApiApplication>(*args)
}

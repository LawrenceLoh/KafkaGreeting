package com.daimler.kstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KstreamApplication

fun main(args: Array<String>) {
	runApplication<KstreamApplication>(*args)
}


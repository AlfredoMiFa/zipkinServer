package com.mistborn.airline

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZipkinServerApplication

fun main(args: Array<String>) {
	runApplication<ZipkinServerApplication>(*args)
}

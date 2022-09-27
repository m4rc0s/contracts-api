package org.natwork.contractsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContractsApiApplication

fun main(args: Array<String>) {
	runApplication<ContractsApiApplication>(*args)
}

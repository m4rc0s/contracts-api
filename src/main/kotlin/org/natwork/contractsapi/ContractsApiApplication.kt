package org.natwork.contractsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class ContractsApiApplication

fun main(args: Array<String>) {
	runApplication<ContractsApiApplication>(*args)
}

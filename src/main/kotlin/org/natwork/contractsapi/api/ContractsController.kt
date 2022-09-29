package org.natwork.contractsapi.api

import org.natwork.contractsapi.api.models.ContractDTO
import org.natwork.contractsapi.models.Contract
import org.natwork.contractsapi.services.ContractService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/contracts")
class ContractsController {

    @Autowired
    private lateinit var service: ContractService

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody requestBody: ContractDTO) = service.create(requestBody)

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun findById(@PathVariable id: UUID): Contract {
        return service.findById(id)
    }

}
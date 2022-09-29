package org.natwork.contractsapi.services

import org.natwork.contractsapi.api.models.ContractDTO
import org.natwork.contractsapi.data.ContractRepository
import org.natwork.contractsapi.models.Contract
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ContractService(
    val repository: ContractRepository
) {
    fun create(contractDTO: ContractDTO): Contract {
        val contract = Contract(
            description = contractDTO.description,
            example = contractDTO.example,
            schema = contractDTO.schema
        )
        return repository.save(contract)
    }

    fun findById(id: UUID): Contract {
        val contract = repository.findById(id.toString()).get()
        return contract
    }

}
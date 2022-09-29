package org.natwork.contractsapi.data

import org.natwork.contractsapi.models.Contract
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ContractRepository : MongoRepository<Contract, String> {}
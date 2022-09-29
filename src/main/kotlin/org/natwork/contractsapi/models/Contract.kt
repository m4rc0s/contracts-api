package org.natwork.contractsapi.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.UUID

@Document("contracts")
data class Contract(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val description: String,
    val example: String,
    val schema: String,
    val revision: Long = 1L,
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val createdAt: LocalDateTime = LocalDateTime.now()
) {
    fun bumpVersion(): Contract {
        this.revision.plus(1L)
        return this
    }
}

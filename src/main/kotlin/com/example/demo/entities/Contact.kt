package com.example.demo.entities

import com.sun.istack.NotNull
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Size

@Entity
@Table(name = "contacts")
class Contact (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @field:NotNull
    @field:Size(min = 5, max = 50, message = "messagem customizada de teste")
    var name: String,

    @field:NotNull
    @field:Email
    var email: String
        )
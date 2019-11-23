package com.wheeler.app.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "USER")
data class TestUser (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var userId: Long = -1,

        @Column(name = "firstName")
        var firstName: String = "",

        @Column(name = "lastName")
        var lastName: String = "",

        @Column(name = "email")
        var email: String = "",

        @Column(name = "registrationDate")
        var registrationDate: LocalDateTime = LocalDateTime.now()

)

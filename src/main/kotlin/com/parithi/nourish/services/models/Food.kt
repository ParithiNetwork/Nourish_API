package com.parithi.nourish.services.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Food (
    @Id
    val id: String?,

    @Column
    val name: String?,

    @Column
    val description: String?,

    @Column
    val isDrink: Boolean
)
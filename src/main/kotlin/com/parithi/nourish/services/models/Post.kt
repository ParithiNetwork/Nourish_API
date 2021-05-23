package com.parithi.nourish.services.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Post (

    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column
    val title: String?,

    @Column(length = 2000)
    val description: String? = null,

    @Column
    val keywords: String? = null
)
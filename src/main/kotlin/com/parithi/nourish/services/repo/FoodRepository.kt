package com.parithi.nourish.services.repo

import com.parithi.nourish.services.models.Food
import org.springframework.data.repository.CrudRepository

interface FoodRepository : CrudRepository<Food, String> {
    fun findByName(name: String) : Food?
}
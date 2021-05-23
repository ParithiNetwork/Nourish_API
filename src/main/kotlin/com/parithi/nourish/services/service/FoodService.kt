package com.parithi.nourish.services.service

import com.parithi.nourish.services.models.Food
import com.parithi.nourish.services.repo.FoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class FoodService {

    @Autowired
    private lateinit var foodRepository: FoodRepository

    fun createFoodItem(id: String) : Food {
        return foodRepository.findByIdOrNull(id) ?: foodRepository.save(Food(id, null, null, false))
    }

    fun lookup() : Iterable<Food> {
        return foodRepository.findAll()
    }

    fun total() : Long {
        return foodRepository.count()
    }

}
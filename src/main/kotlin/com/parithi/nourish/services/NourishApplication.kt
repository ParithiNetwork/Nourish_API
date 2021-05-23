package com.parithi.nourish.services

import com.parithi.nourish.services.service.FoodService
import com.parithi.nourish.services.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NourishApplication : CommandLineRunner {

	@Autowired
	private lateinit var foodService: FoodService

	@Autowired
	private lateinit var postService: PostService

	override fun run(vararg args: String?) {
		createFoodItems()
		val foodItems = foodService.lookup()
		createPostItems()

		val posts = postService.lookup()
	}

	private fun createPostItems() {
		postService.createPost("Hello Post", "Food", "hello")
	}

	private fun createFoodItems() {
		foodService.createFoodItem("Idly")
		foodService.createFoodItem("Bonda")
		foodService.createFoodItem("Chicken")
		foodService.createFoodItem("Fish")
		foodService.createFoodItem("Juice")
		foodService.createFoodItem("Rasmalans")
	}

}

fun main(args: Array<String>) {
	runApplication<NourishApplication>(*args)
}

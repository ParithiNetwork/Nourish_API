package com.parithi.nourish.services.repo

import com.parithi.nourish.services.models.Post
import org.springframework.data.repository.CrudRepository

interface PostRepository : CrudRepository<Post, Long>
package com.parithi.nourish.services.service

import com.parithi.nourish.services.models.Post
import com.parithi.nourish.services.repo.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService {

    @Autowired
    private lateinit var postRepository : PostRepository

    fun createPost(title: String, description: String, keywords: String) : Post {
        return postRepository.save(Post(title = title,description = null,keywords = null))
    }

    fun lookup() : Iterable<Post> {
        return postRepository.findAll()
    }

    fun total() : Long {
        return postRepository.count()
    }

}
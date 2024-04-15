package com.example.wardrobeapi

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WardrobeApiController(@Autowired private val appProperties: AppProperties) {

    @GetMapping("/my_best_cloth")
    fun getALlClothes(): Cloth {
        return Cloth("One of " + appProperties.text + " is T-shirt" )
    }
}
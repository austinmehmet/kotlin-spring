package com.kt.sample.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RatingWebServiceConfig {

    @Value("resources.api.rating")
    private lateinit var uri: String

    @Value("resources.api.rating.username")
    private lateinit var username: String

    @Value("resources.api.rating.password")
    private lateinit var password: String


    @Bean(value= ["RatingRestTemplate"])
    public fun generateRestTemplateForRatingAPI(restTemplateBuilder: RestTemplateBuilder): RestTemplate {
        return restTemplateBuilder
                .rootUri(uri)
                .basicAuthentication(username, password)
                .build()
    }
}
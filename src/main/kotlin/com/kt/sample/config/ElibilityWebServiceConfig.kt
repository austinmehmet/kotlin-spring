package com.kt.sample.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class ElibilityWebServiceConfig {

    @Value("resources.api.eligibility")
    private lateinit var uri: String

    @Value("resources.api.eligibility.username")
    private lateinit var username: String

    @Value("resources.api.eligibility.password")
    private lateinit var password: String


    @Bean(value= ["EligibilityRestTemplate"])
    public fun generateRestTemplateForEligibilityAPI(restTemplateBuilder: RestTemplateBuilder): RestTemplate {
        return restTemplateBuilder
                .rootUri(uri)
                .basicAuthentication(username, password)
                .build()
    }

}
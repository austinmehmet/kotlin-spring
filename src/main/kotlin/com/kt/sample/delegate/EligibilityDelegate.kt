package com.kt.sample.delegate

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class EligibilityDelegate(
        @Qualifier("EligibilityRestTemplate") private val restTemplate: RestTemplate
) {

    public fun makeRequest() {
        println(restTemplate.toString())
    }
}
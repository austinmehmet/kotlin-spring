package com.kt.sample.services

import com.kt.sample.models.QuoteRequestResponse
import org.springframework.stereotype.Component

@Component
class QuoteRequestService {

    public fun createRequest(): QuoteRequestResponse {
        return QuoteRequestResponse("1234-1234")
    }
}
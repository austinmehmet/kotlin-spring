package com.kt.sample.services

import com.kt.sample.delegate.EligibilityDelegate
import com.kt.sample.delegate.RatingDeleagate
import com.kt.sample.models.QuoteRequestResponse
import org.springframework.stereotype.Component

@Component
class QuoteRequestService(
        private val ratingDelegate: RatingDeleagate,
        private val eligibilityDelegate: EligibilityDelegate
) {

    public fun createRequest(): QuoteRequestResponse {
        println("The below two delegates should print different memory locations")
        ratingDelegate.makeRequest()
        eligibilityDelegate.makeRequest()
        return QuoteRequestResponse("1234-1234")
    }
}
package com.kt.sample.controllers

import com.kt.sample.models.QuoteRequest
import com.kt.sample.models.QuoteRequestResponse
import com.kt.sample.services.QuoteRequestService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QuoteRequestController(private val quoteRequestService: QuoteRequestService) {

    @PostMapping("/quote-request")
    fun createQuoteRequest(@RequestBody quoteRequest: QuoteRequest): ResponseEntity<QuoteRequestResponse> {
        val response = quoteRequestService.createRequest()
        return ResponseEntity.ok(response)
    }
}
package com.kt.sample.controllers.advice

import com.fasterxml.jackson.databind.JsonMappingException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

data class ApiError(val message: String)

@ControllerAdvice
class ExceptionHandlerAdvice {

    @ExceptionHandler(value = [JsonMappingException::class])
    fun handle(exception: JsonMappingException, request: WebRequest): ResponseEntity<ApiError> {
        val fields = mutableListOf<String>()
        exception.path.forEach { fields.add(it.fieldName) }
        val path = fields.joinToString(separator = ".")

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiError("${path.toString()} is missing"))
    }

}
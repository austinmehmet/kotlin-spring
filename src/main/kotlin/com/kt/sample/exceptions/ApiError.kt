package com.kt.sample.exceptions

import org.springframework.http.HttpStatus
import java.lang.RuntimeException

class ApiError(message:String, val status: HttpStatus, val errors: MutableList<String>): Exception(message) {

}
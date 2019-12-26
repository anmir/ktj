package com.github.ktj

import com.fasterxml.jackson.module.kotlin.MissingKotlinParameterException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.ControllerAdvice

@RestController
class Controller {

    private val books = mutableListOf<Book>()
    @PostMapping("/books/add")
    fun add(@RequestBody book: Book) {
        books += book
    }

    @GetMapping("/books")
    fun getAll(): List<Book> {
        return books
    }

}

@ControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(MissingKotlinParameterException::class)
    fun handle(ex: MissingKotlinParameterException): ResponseEntity<ErrorResponse> {
        val attributePath = ex.path.joinToString(separator = ".") { it -> it.fieldName }
        return ResponseEntity(ErrorResponse("WRONG_JSON", "Attribute \"$attributePath\" must not be null"), HttpStatus.BAD_REQUEST)
    }


}

data class ErrorResponse(
        val error: String,
        val message: String
)
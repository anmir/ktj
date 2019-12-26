package com.github.ktj


data class Book(
        val author: Author,
        val language: String,
        val pages: Int?
)

data class Author(
        val firstName: String,
        val age: Int?
)
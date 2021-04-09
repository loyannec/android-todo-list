package com.example.todolist

// Data = because I put here as a constructor with my properties
data class Todo(
    val title: String,
    var isChecked: Boolean = false
)
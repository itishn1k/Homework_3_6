package com.example.homework_3_6

data class Song(
    val number: Int,
    var song: String? = "Unknown Song",
    var artist: String? = "Unknown Artist",
    var duration: String? = "Unknown Duration"
)

package com.example.jaway.models

import java.time.LocalDate

class Film (val genre : ArrayList<String>, val id: Int, val overview: String,
            val poster_path: String, val release_date: LocalDate, val title: String) {
}
package com.example.praktikum5_navigationcompose_245150200111040.model

data class Student(
    val nim: String,
    val nama: String,
    val ipk: Double,
    val jurusan: String
)

val sampleStudent = Student(
    nama = "Daffi Ramadian",
    nim = "245150200111040",
    ipk = 4.00,
    jurusan = "Teknik Informatika"
)

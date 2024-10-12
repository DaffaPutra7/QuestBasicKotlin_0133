package com.example.questbasickotlin_0133

// List adalah Kumpulan data yang disusun secara berurutan
// List bersifat Ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat Mutable dan Read-Only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List  Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList() {

    println("=== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

}
package com.example.myapplication

fun withoutParameter() {
    println("=== withoutParameter ===")
    println("Hello, Lintang")
}

fun withParameter(name: String){
    println()
    println("=== withParameter ===")
    println("Hello, $name!")
}

// named argument
// named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("=== withNamedArgument ===")
    println("Hello, $name! You are $age years old")
}

// default parameter value
// default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Lintang", age: Int){
    println()
    println("=== withDefaultParameter ===")
    println("Hello, $name! You are $age years old")
}

fun withReturn(panjang: Int, lebar: Int): Int {
    println()
    println("=== withReturn ===")
    return panjang * lebar // Mengembalikan hasil luas
}

fun main (){
    withoutParameter()
    withParameter("Lintang")
    withNamedArgument("Lintang", age = 18)
    withDefaultParameter (age = 18)
    val luas = withReturn(20, 9) // Memanggil fungsi dan menyimpan hasilnya
    println("Luas: $luas") // Mencetak hasil luas
}
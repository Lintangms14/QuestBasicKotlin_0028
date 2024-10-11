package com.example.myapplication

class Motor ()

class Contact(val id: Int, var email: String)


// Fungsi main harus berada di luar kelas
fun main() {
    val contact = Contact(1, "mary@gmail.com")

    // Print the value of the property: email
    println(contact.email)

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Print the new value of the property: email
    println(contact.email)
}
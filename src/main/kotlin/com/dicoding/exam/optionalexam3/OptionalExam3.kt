package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberRegex = Regex("[0-9]+")
    val match = numberRegex.find(str)

    return if (match != null) {
        val number = match.value.toInt()
        val newNumber = number * int
        str.replace(match.value, newNumber.toString())
    } else {
        str + int
    }
}

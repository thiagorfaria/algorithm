package ch01

import java.util.*

fun checkPermutation(text: String, text2: String): Boolean {

    if (text.length != text2.length)
        return false

    val chars = text.toCharArray()
    Arrays.sort(chars)

    val chars2 = text2.toCharArray()
    Arrays.sort(chars2)

    return String(chars) == String(chars2)
}

fun checkPermutation2(text: String, text2: String): Boolean {
    if (text.length != text2.length)
        return false

    // space complexity is O(n)
    val letters = IntArray(128)

    // time complexity is O(n)
    text.toCharArray().forEach { letters[it.toInt()]++ }

    // time complexity is O(n)
    text2.toCharArray().forEach {
        val i = it.toInt()
        letters[i]--
        if (letters[i] < 0) {
            return false
    }}

    return true
}



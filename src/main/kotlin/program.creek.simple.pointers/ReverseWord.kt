package program.creek.simple.pointers

import extention.reverse

fun reverseWord(word: CharArray) {

    var i = 0
    // time complexity is O(n)
    for (j in 0 until word.size) {
        if (word[j] == ' ') {
            // space complexity is O(1)
            // time complexity is O(n)
            word.reverse(i, j - 1)
            i = j + 1
        }
    }

    // space complexity is O(1)
    // time complexity is O(n)
    word.reverse(i, word.size - 1)
    word.reverse(0, word.size - 1)
}

fun reverseWord(s: String): String {
    if (s.trim().isEmpty())
        return s

    // split to words by space
    // space complexity is O(n)
    val words = s.split(" ")

    var result = ""
    // time complexity is O(n)
    words.reversed()
        .filter { it != "" }
        .forEach { result += "$it " }

    return result.dropLast(1)
}
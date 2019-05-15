package ch01

fun isUniqueChars(text: String): Boolean {

    // Complexity O(n) and time space complexity is O(1)
    val temp: LinkedHashSet<Char> = linkedSetOf()
    text.forEach { s -> temp.add(s) }

    return text.length == temp.size
}

fun isUniqueChars2(text: String): Boolean {
    if (text.length > 128) return false

    val chars = BooleanArray(128)

    // Complexity O(n) and time space complexity is O(1)
    text.forEach { s ->
        val c: Int = s.toInt()
        if (chars[c]) {
            return false
        }
        chars[c] = true
    }

    return true
}

internal fun isUniqueChars3(str: String): Boolean {
    var checker = 0
    for (i in 0 until str.length) {
        val value = str[i] - 'a'
        if (checker and (1 shl value) > 0) {
            return false
        }
        checker = checker or (1 shl value)
    }
    return true
}
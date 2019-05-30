package utils

import java.util.Arrays

fun binarySearch(numbers: IntArray, target: Int): Int {
    val hi = numbers.size

    // time complexity is O(N log N)
    // space complexity is O(1)
    val ind = Arrays.binarySearch(numbers, target)

    return if (ind in 0 until hi && numbers[ind] == target) ind else -1
}

/**
 * Returns the product of all elements in the array.
 */
fun IntArray.product(): Int {
    var total = 1

    //time complexity is o(n)
    for (element in this)
        total *= element

    return total
}

/**
 * Reverses elements in the array in-place from start index until end index.
 *
 * @param startIndex the start index (inclusive).
 * @param endIndex the end index (exclusive).
 */
fun IntArray.reverse(startIndex: Int, endIndex: Int) {
    var l = startIndex
    var r = endIndex

    if (this.size > 1)
        while (l < r) {
            val temp = this[l]
            this[l] = this[r]
            this[r] = temp
            l++
            r--
        }
}
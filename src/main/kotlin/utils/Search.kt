package utils

import java.util.*

fun binarySearch(numbers: IntArray, target: Int) : Int {
    val hi = numbers.size

    // time complexity is O(N log N)
    // space complexity is O(1)
    val ind = Arrays.binarySearch(numbers, target)

    return if (ind in 0 until hi && numbers[ind] == target) ind else -1
}
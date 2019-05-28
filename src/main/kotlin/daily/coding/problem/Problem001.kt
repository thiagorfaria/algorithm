package daily.coding.problem

import utils.binarySearch

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
fun problem001Solution01(numbers: IntArray, k: Int) : Boolean {

    // time complexity is O((n-1)^2)
    for (i in 0 until (numbers.size - 1))
        for (b in (i + 1) until numbers.size)
            if (numbers[i] + numbers[b] == k)
                return true

    return false
}

fun problem001Solution02(numbers: IntArray, k: Int) : Boolean {

    // space complexity is O(1)
    val seen = hashSetOf<Int>()

    // time complexity is O(n)
    for (num in numbers) {
        if (k - num in seen)
            return true
        seen.add(num)
    }

    return false
}

fun problem001Solution03(numbers: IntArray, k: Int) : Boolean {

    numbers.sort()

    // time complexity is O(n)
    iterateNumbers@ for (i in 0 until (numbers.size - 1)) {
        val target = k - numbers[i]

        // time complexity is O(N log N)
        // space complexity is O(1)
        val j = binarySearch(numbers, target)

        // Check that binary search found the target and that it's not in the same index
        // as i. If it is in the same index, we can check numbers[i + 1] and numbers[i - 1] to see
        // if there's another number that's the same value as numbers[i].
        when {
            j == -1 -> continue@iterateNumbers
            j != i -> return true
            j + 1 < numbers.size && numbers[j + 1] == target -> return true
            j - 1 >= 0 && numbers[j - 1] == target -> return true
        }
    }

    return false
}
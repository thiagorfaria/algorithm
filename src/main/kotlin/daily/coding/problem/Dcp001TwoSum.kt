package daily.coding.problem

import extention.binarySearch

/**
 *
 * This problem can be solved in several different ways.
 *
 * Brute force way would involve a nested iteration to check for every pair of numbers:
 */
fun twoSumSolution01(numbers: IntArray, k: Int): Boolean {

    // time complexity is O((n-1)^2)
    for (i in 0 until (numbers.size - 1))
        for (b in (i + 1) until numbers.size)
            if (numbers[i] + numbers[b] == k)
                return true

    return false
}

/**
 * This would take O(N2). Another way is to use a set to remember the numbers we've seen so far. Then for a given
 * number, we can check if there is another number that, if added, would sum to k. This would be O(N) since lookups of
 * sets are O(1) each.
 */
fun twoSumSolution02(numbers: IntArray, k: Int): Boolean {

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

/**
 * Yet another solution involves sorting the list. We can then iterate through the list and run a binary search on K -
 * numbers[i]. Since we run binary search on N elements, this would take O(N log N) with O(1) space.
 */
fun twoSumSolution03(numbers: IntArray, k: Int): Boolean {

    numbers.sort()

    // time complexity is O(n)
    iterateNumbers@ for (i in 0 until (numbers.size - 1)) {
        val target = k - numbers[i]

        // time complexity is O(n log n)
        // space complexity is O(1)
        val j = numbers.binarySearch(target)

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
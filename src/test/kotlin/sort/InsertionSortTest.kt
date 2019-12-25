package sort

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec

/**
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list)
 * one item at a time. It is much less efficient on large lists than more advanced algorithms
 * such as quicksort, heapsort, or merge sort.
 *
 * Ex:
 * 3  7  4  9  5  2  6  1
 * 3* 7  4  9  5  2  6  1
 * 3  7* 4  9  5  2  6  1
 * 3  4* 7  9  5  2  6  1
 * 3  4  7  9* 5  2  6  1
 * 3  4  5* 7  9  2  6  1
 * 2* 3  4  5  7  9  6  1
 * 2  3  4  5  6* 7  9  1
 * 1* 2  3  4  5  6  7  9
 *
 * Worst-case performance	    О(n2)   comparisons and swaps
 * Best-case performance	    O(n)    comparisons,    O(1) swaps
 * Average performance	        О(n2)   comparisons and swaps
 * Worst-case space complexity	О(n)    total,          O(1) auxiliary
 */
class InsertionSortTest : StringSpec({

    "Should sort array" {
        val numbers = intArrayOf(3, 7, 4, 9, 5, 2, 6, 1)
        val result = listOf(1, 2, 3, 4, 5, 6, 7, 9)

        sort(numbers)
        numbers.toList() shouldContainExactly result
    }

    "Should sort array by brute force" {
        val numbers = intArrayOf(3, 7, 4, 9, 5, 2, 6, 1)
        val result = listOf(1, 2, 3, 4, 5, 6, 7, 9)

        bruteSort(numbers)
        numbers.toList() shouldContainExactly result
    }
})



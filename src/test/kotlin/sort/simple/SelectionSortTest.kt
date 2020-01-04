package sort.simple

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec

/**
 * Selection sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2)
 * time complexity, making it inefficient on large lists, and generally performs worse than the
 * similar insertion sort. Selection sort is noted for its simplicity, and it has performance
 * advantages over more complicated algorithms in certain situations, particularly where auxiliary
 * memory is limited.
 *
 * Selection sort
 * Worst-case performance	    О(n2) comparisons, О(n) swaps
 * Best-case performance	    О(n2) comparisons, О(n) swaps
 * Average performance	        О(n2) comparisons, О(n) swaps
 * Worst-case space complexity	O(1) auxiliary
 */
class SelectionSortTest : StringSpec({

    "Should sort array" {
        val numbers = intArrayOf(2, 8, 5, 3, 9, 4, 1)
        val result = listOf(1, 2, 3, 4, 5, 8, 9)

        selectionSort(numbers)
        numbers.toList() shouldContainExactly result
    }
})



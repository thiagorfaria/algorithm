package sort.efficient

import io.kotlintest.data.suspend.forall
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

/**
 * Merge sort (also commonly spelled mergesort) is an efficient, general-purpose, comparison-based sorting algorithm.
 * Most implementations produce a stable sort, which means that the order of equal elements is the same in the input
 * and output.
 *
 * Worst-case performance	    O(n log n)
 * Best-case performance	    O(n log n) typical, O(n) natural variant
 * Average performance	        O(n log n)
 * Worst-case space complexity	О(n) total with O(n) auxiliary, O(1) auxiliary with linked lists[1]
 */
class MergeSortTest : StringSpec({

    "Should sort array" {
        forall(
            row(intArrayOf(2, 8, 5, 3, 9, 4, 1, 6), listOf(1, 2, 3, 4, 5, 6, 8, 9)),
            row(intArrayOf(2, 8, 5, 3, 9, 4, 1), listOf(1, 2, 3, 4, 5, 8, 9))
        )
        { numbers, result ->
            mergeSort(numbers)
            numbers.toList() shouldContainExactly result
        }
    }
})



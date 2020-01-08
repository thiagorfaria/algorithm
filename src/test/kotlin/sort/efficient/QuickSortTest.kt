package sort.efficient

import io.kotlintest.data.suspend.forall
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

/**
 * Quicksort is a comparison sort, meaning that it can sort items of any type for which a "less-than" relation
 * (formally, a total order) is defined. Efficient implementations of Quicksort are not a stable sort, meaning that the
 * relative order of equal sort items is not preserved. Quicksort can operate in-place on an array, requiring small
 * additional amounts of memory to perform the sorting.
 *
 * Worst-case performance	    O(n2)
 * Best-case performance	    O(n log n) (simple partition) or O(n) (three-way partition and equal keys)
 * Average performance	        O(n log n)
 * Worst-case space complexity	O(n) auxiliary (naive) O(log n) auxiliary
 */
class QuickSortTest : StringSpec({

    "Should sort array" {
        forall(
            row(intArrayOf(3, 1), listOf(1, 3)),
            row(intArrayOf(1, 2, 3), listOf(1, 2, 3)),
            row(intArrayOf(1, 3, 2), listOf(1, 2, 3)),
            row(intArrayOf(2, 1, 3), listOf(1, 2, 3)),
            row(intArrayOf(2, 3, 1), listOf(1, 2, 3)),
            row(intArrayOf(3, 1, 2), listOf(1, 2, 3)),
            row(intArrayOf(3, 2, 1), listOf(1, 2, 3)),
            row(intArrayOf(7, 2, 4, 3, 0, 5, 1), listOf(0, 1, 2, 3, 4, 5, 7)),
            row(intArrayOf(2, 8, 5, 3, 9, 4, 1), listOf(1, 2, 3, 4, 5, 8, 9))
        )
        { numbers, result ->
            quickSort(numbers)
            numbers.toList() shouldContainExactly result
        }
    }

    "Should sort median of three" {
        forall(
            row(intArrayOf(1, 2, 3), listOf(1, 2, 3)),
            row(intArrayOf(1, 3, 2), listOf(1, 2, 3)),
            row(intArrayOf(2, 1, 3), listOf(1, 2, 3)),
            row(intArrayOf(2, 3, 1), listOf(1, 2, 3)),
            row(intArrayOf(3, 1, 2), listOf(1, 2, 3)),
            row(intArrayOf(3, 2, 1), listOf(1, 2, 3))
        )
        { numbers, result ->
            medianOfThree(numbers, 0, 2)
            numbers.toList() shouldContainExactly result
        }
    }
})
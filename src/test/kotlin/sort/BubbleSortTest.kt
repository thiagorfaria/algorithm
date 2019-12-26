package sort

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that
 * repeatedly steps through the list, compares adjacent elements and swaps them if they
 * are in the wrong order. The pass through the list is repeated until the list is sorted.
 *
 * First Pass
 * ( 5 1 4 2 8 ) → ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and
 * swaps since 5 > 1.
 * ( 1 5 4 2 8 ) → ( 1 4 5 2 8 ), Swap since 5 > 4
 * ( 1 4 5 2 8 ) → ( 1 4 2 5 8 ), Swap since 5 > 2
 * ( 1 4 2 5 8 ) → ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5),
 * algorithm does not swap them.
 * Second Pass
 * ( 1 4 2 5 8 ) → ( 1 4 2 5 8 )
 * ( 1 4 2 5 8 ) → ( 1 2 4 5 8 ), Swap since 4 > 2
 * ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 * Now, the array is already sorted, but the algorithm does not know if it is completed.
 * The algorithm needs one whole pass without any swap to know it is sorted.
 *
 * Third Pass
 * ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 *
 * Worst-case performance	    O(n^2)    comparisons, O(n^2) swaps
 * Best-case performance	    O(n)      comparisons, O(1) swaps
 * Average performance	        O(n^2)    comparisons, O(n^2) swaps
 * Worst-case space complexity	O(1) auxiliary
 */
class BubbleSortTest : StringSpec({

    "Should sort array" {
        val numbers = intArrayOf(1, 2, 8, 5, 3, 9, 4, 6)
        val result = listOf(1, 2, 3, 4, 5, 6, 8, 9)

        bubbleSort(numbers) shouldBe 21
        numbers.toList() shouldContainExactly result
    }

    "Should sort array brute force" {
        val numbers = intArrayOf(1, 2, 8, 5, 3, 9, 4, 6)
        val result = listOf(1, 2, 3, 4, 5, 6, 8, 9)

        bubbleSortBruteForce(numbers) shouldBe 34
        numbers.toList() shouldContainExactly result
    }

    "Should sort array by mega brute force" {
        val numbers = intArrayOf(1, 2, 8, 5, 3, 9, 4, 6)
        val result = listOf(1, 2, 3, 4, 5, 6, 8, 9)

        bubbleSortMegaBruteForce(numbers) shouldBe 56
        numbers.toList() shouldContainExactly result
    }
})



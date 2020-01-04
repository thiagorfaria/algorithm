package search

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Binary search compares the target value to the middle element of the array. If they are not equal, the half in which
 * the target cannot lie is eliminated and the search continues on the remaining half, again taking the middle element
 * to compare to the target value, and repeating this until the target value is found.
 *
 * Worst-case performance	    O(log n)
 * Best-case performance	    O(1)
 * Average performance	        O(log n)
 * Worst-case space complexity	O(1)
 */
class BinarySearchKtTest : StringSpec({

    "should find a number" {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
        search(numbers, 2) shouldBe true
    }

    "cannot find a number when number is not in array" {
        val numbers = intArrayOf(1, 2, 3, 5, 6)
        search(numbers, 4) shouldBe false
    }
})
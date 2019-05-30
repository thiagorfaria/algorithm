package program.creek.simple.pointers

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec

/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * How many different ways do you know to solve this problem?
 */
class RotateArrayKtTest : StringSpec({

    "Should rotate array with intermediate rotate" {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val result = listOf(5, 6, 7, 1, 2, 3, 4)

        intermediateRotateArray(numbers, 3)
        numbers.toList() shouldContainExactly result
    }

    "Should rotate array with bubble rotate" {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val result = listOf(5, 6, 7, 1, 2, 3, 4)

        bubbleRotateArray(numbers, 3)
        numbers.toList() shouldContainExactly result
    }

    "Should rotate array with reversal rotate" {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val result = listOf(5, 6, 7, 1, 2, 3, 4)

        reversalRotateArray(numbers, 3)
        numbers.toList() shouldContainExactly result
    }
})
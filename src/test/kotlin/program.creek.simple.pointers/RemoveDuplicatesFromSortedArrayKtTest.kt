package program.creek.simple.pointers

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 *
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new
 * length. Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].
 *
 * Analysis
 *
 * The problem is pretty straightforward. It returns the length of the array with unique elements, but the original
 * array need to be changed also.
 *
 * Note that we only care about the first unique part of the original array. So it is ok if input array is
 * {1, 2, 2, 3, 3}, the array is changed to {1, 2, 3, 3, 3}.
 */
class RemoveDuplicatesFromSortedArrayKtTest : StringSpec({

    "Should remove duplicates from sorted array" {

        val intNumbers = intArrayOf(1, 1, 1, 2, 3, 4, 4, 4, 5)
        val removeDuplicates = removeDuplicates(intNumbers)

        removeDuplicates.size shouldBe 5
    }
})
package daily.coding.problem

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of
 * all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was
 * [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
class Dpc002ProductsOfNumbersKtTest : StringSpec({

    // TODO a matcher to intArray. To do a refactoring on function to return intArray
    "should product of all the numbers" {
        forall(

            row(intArrayOf(1, 2, 3, 4, 5), "120, 60, 40, 30, 24"),
            row(intArrayOf(3, 2, 1), "2, 3, 6"),
            row(intArrayOf(7), "7"),
            row(intArrayOf(), "")

        ) { numbers, result ->
            productOfNumbersSolution01(numbers) shouldBe result
            productOfNumbersSolution02(numbers) shouldBe result
        }
    }
})

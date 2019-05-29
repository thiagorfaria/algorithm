package program.creek.simple.pointers

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Given an array and a value, remove all instances of that value in place and return the new length. (Note: The order
 * of elements can be changed. It doesn't matter what you leave beyond the new length.)
 *
 * This problem can be solve by using two indices and can be solve using lambda expression
 */
class RemoveElementKtTest : StringSpec({

    //TODO write before setup to those tests.
    "Should remove element" {
        val numbers = intArrayOf(1, 2, 2, 3, 2, 3)
        removeElement(numbers, 2).size shouldBe 3
    }

    "Should remove element with lambda expression" {
        val numbers = intArrayOf(1, 2, 2, 3, 2, 3)
        removeElementWithLambdaExpression(numbers, 2).size shouldBe 3
    }

})
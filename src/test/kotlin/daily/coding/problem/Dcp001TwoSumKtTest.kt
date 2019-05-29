package daily.coding.problem

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
class Dcp001TwoSumKtTest : StringSpec({

    val numbers = intArrayOf(10, 15, 3, 7)

    "should return whether any two numbers from the list add up to k" {
        forall(row(25), row(13), row(17), row(18), row(22), row(10)) {
            twoSumSolution01(numbers, it) shouldBe true
            twoSumSolution01(numbers, it) shouldBe true
            twoSumSolution03(numbers, it) shouldBe true
        }
    }

    "cannot return when two numbers from the list not add up to k" {
        twoSumSolution01(numbers, 20) shouldBe false
        twoSumSolution02(numbers, 20) shouldBe false
        twoSumSolution03(numbers, 20) shouldBe false

    }
})
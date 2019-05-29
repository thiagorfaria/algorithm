package utils

import io.kotlintest.data.forall
import io.kotlintest.matchers.numerics.shouldBeInRange
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class ArraysKtTest : StringSpec({

    "should find int in array" {
        val numbers = intArrayOf(3, 7, 10, 15)

        forall(row(3), row(7), row(10), row(15)) {
            binarySearch(numbers, it) shouldBeInRange IntRange(0, 3)
        }
    }

    "cannot find when int is not in array" {
        val numbers = intArrayOf(3, 7, 10, 15)

        forall(row(-5), row(22)) {
            binarySearch(numbers, it) shouldBe -1
        }
    }

    "should calculate the product of numbers" {
        forall(
            row(intArrayOf(1, 2, 3, 4, 5), 120),
            row(intArrayOf(0), 0)
        )
        { numbers, result ->
            numbers.product() shouldBe result
        }
    }

})
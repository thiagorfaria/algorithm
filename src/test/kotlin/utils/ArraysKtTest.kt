package utils

import io.kotlintest.data.forall
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.matchers.numerics.shouldBeInRange
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class ArraysKtTest : StringSpec({

    "should find int in array and return index of the search key" {
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

    "should revere array by index" {
        forall(
            row(intArrayOf(1, 2, 3, 4, 5), 0, 2, listOf(3, 2, 1, 4, 5)),
            row(intArrayOf(1, 2, 3, 4, 5), 4, 2, listOf(1, 2, 3, 4, 5)),
            row(intArrayOf(1), 0, 1, listOf(1)),
            row(intArrayOf(), 0, 0, listOf())
        )
        { numbers, startIndex, endIndex, result ->
            numbers.reverse(startIndex, endIndex)
            numbers.toList() shouldContainExactly result
        }
    }
})
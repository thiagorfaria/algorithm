package utils

import io.kotlintest.data.forall
import io.kotlintest.matchers.numerics.shouldBeInRange
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class SearchTest : StringSpec({

    val numbers = intArrayOf(3, 7, 10, 15)

    "should find int in array" {
        forall(row(3), row(7), row(10), row(15)) {
            binarySearch(numbers, it) shouldBeInRange IntRange(0, 3)
        }
    }

    "cannot find when int is not in array" {
        forall(row(-5), row(22)) {
            binarySearch(numbers, it) shouldBe -1
        }
    }

})
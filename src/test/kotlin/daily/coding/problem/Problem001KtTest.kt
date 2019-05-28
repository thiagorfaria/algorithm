package daily.coding.problem

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class Problem001KtTest : StringSpec({

    val numbers = intArrayOf(10, 15, 3, 7)

    "should return whether any two numbers from the list add up to k" {
        forall(row(25), row(13), row(17), row(18), row(22), row(10)) {
            problem001Solution01(numbers, it) shouldBe true
            problem001Solution01(numbers, it) shouldBe true
            problem001Solution03(numbers, it) shouldBe true
        }
    }

    "cannot return when two numbers from the list not add up to k" {
        problem001Solution01(numbers, 20) shouldBe false
        problem001Solution02(numbers, 20) shouldBe false
        problem001Solution03(numbers, 20) shouldBe false

    }
})
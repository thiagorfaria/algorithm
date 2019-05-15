package daily.coding.problem

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Problem001KtTest : StringSpec({

    "Test problem 001 May 2019" {
        problem001(intArrayOf(10, 15, 3, 7), 25) shouldBe true
        problem001(intArrayOf(10, 15, 3, 7), 13) shouldBe true
        problem001(intArrayOf(10, 15, 3, 7), 17) shouldBe true
        problem001(intArrayOf(10, 15, 3, 7), 18) shouldBe true
        problem001(intArrayOf(10, 15, 3, 7), 22) shouldBe true
        problem001(intArrayOf(10, 15, 3, 7), 10) shouldBe true

        problem001(intArrayOf(10, 15, 3, 7), 20) shouldBe false

    }
})
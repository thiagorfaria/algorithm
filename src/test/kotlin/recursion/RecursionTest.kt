package recursion

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RecursionTest : StringSpec({

    "should calculate factorial numbers using recursion" {
        fact(5) shouldBe 120
    }
})

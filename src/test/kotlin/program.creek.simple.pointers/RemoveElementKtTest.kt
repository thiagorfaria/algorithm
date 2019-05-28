package program.creek.simple.pointers

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RemoveElementKtTest : StringSpec({

    //TODO write before setup to those tests.
    "Should remove element" {
        val numbers = intArrayOf(1, 2, 2, 3, 2, 3)
        removeElement(numbers, 2).size shouldBe 3
    }

    "Should remove element 2" {
        val numbers = intArrayOf(1, 2, 2, 3, 2, 3)
        removeElement2(numbers, 2).size shouldBe 3
    }

})
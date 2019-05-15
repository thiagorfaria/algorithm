package br.com.trf.algorithm.program.creek.simple.pointers

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RemoveElementKtTest : StringSpec({

    "Should remove element" {
        removeElement(intArrayOf(1, 2, 2, 3, 2, 3), 2).size shouldBe 3
    }

    "Should remove element 2" {
        removeElement2(intArrayOf(1, 2, 2, 3, 2, 3), 2).size shouldBe 3
    }

})
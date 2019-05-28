package program.creek.simple.pointers

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RemoveDuplicatesFromSortedArrayTest : StringSpec({

    "Should remove duplicates from sorted array" {

        val intNumbers = intArrayOf(1, 1, 1, 2, 3, 4, 4, 4, 5)
        val removeDuplicates = removeDuplicates(intNumbers)

        removeDuplicates.size shouldBe 5
    }
})
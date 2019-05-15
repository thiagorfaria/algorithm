package ch01

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CheckPermutationKtTest : StringSpec({

    "Check Permutation" {
        checkPermutation("god", "dog") shouldBe  true
        checkPermutation("arrays", "rysara") shouldBe true

        checkPermutation("go", "dog") shouldBe false
        checkPermutation("god", "dot") shouldBe false
    }

    "Check Permutation 2" {
        checkPermutation2("god", "dog") shouldBe  true
        checkPermutation2("arrays", "rysara") shouldBe true

        checkPermutation2("go", "dog") shouldBe false
        checkPermutation2("god", "dot") shouldBe false
    }

})
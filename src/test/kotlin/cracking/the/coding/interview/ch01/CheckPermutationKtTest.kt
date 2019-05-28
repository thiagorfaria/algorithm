package cracking.the.coding.interview.ch01

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class CheckPermutationKtTest : StringSpec({

    "should check permutation" {
        forall(row("god", "dog"), row("arrays", "rysara")) {
            text, text2 ->
                checkPermutation(text, text2) shouldBe true
                checkPermutation2(text, text2) shouldBe true
        }
    }

    "cannot check permutation when texts do not match" {
        forall(row("go", "dog"), row("god", "dot")) {
                text, text2 ->
                    checkPermutation(text, text2) shouldBe false
                    checkPermutation2(text, text2) shouldBe false
        }
    }

})
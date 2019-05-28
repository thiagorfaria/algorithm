package cracking.the.coding.interview.ch01

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class IsUniqueTest : StringSpec({

    "should check is unique" {
        val charsUnique = "abcdefg"

        isUniqueChars(charsUnique) shouldBe true
        isUniqueChars2(charsUnique) shouldBe true
        isUniqueChars3(charsUnique) shouldBe true
    }

    "cannot check is unique when chars is not unique." {
        forall(row("a".repeat(128)), row("abcaacg")) {
            isUniqueChars(it) shouldBe false
            isUniqueChars2(it) shouldBe false
            isUniqueChars3(it) shouldBe false
        }
    }
})
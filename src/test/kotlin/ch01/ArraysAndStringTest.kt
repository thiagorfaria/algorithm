package ch01

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ArraysAndStringTest : StringSpec({

    "is Unique" {
        isUniqueChars("abcdefg") shouldBe true
        isUniqueChars("abcaacg") shouldBe false
    }

    "is Unique 2" {
        val sb = StringBuilder()
        repeat(128) {
            sb.append("a")
        }

        isUniqueChars2("abcdefg") shouldBe true
        isUniqueChars2("abcaacg") shouldBe false

        isUniqueChars2(sb.toString()) shouldBe false
    }

    "is Unique 3" {
        val sb = StringBuilder()
        repeat(128) {
            sb.append("a")
        }

        isUniqueChars3("abcdefg") shouldBe true
        isUniqueChars3("abcaacg") shouldBe false

        isUniqueChars3(sb.toString()) shouldBe false
    }

})
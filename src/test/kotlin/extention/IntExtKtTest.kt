package extention

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class IntExtKtTest : StringSpec({

    "should int a less than int b" {
        forall(
            row(1, 2, true),
            row(2, 2, false),
            row(3, 2, false)
        )
        { a, b, result ->
            a lessThan b shouldBe result
        }
    }

    "should int a great than int b" {
        forall(
            row(1, 2, false),
            row(2, 2, false),
            row(3, 2, true)
        )
        { a, b, result ->
            a greatThan b shouldBe result
        }
    }

    "should int a great or equals than int b" {
        forall(
            row(1, 2, false),
            row(2, 2, true),
            row(3, 2, true)
        )
        { a, b, result ->
            a greatOrEqualsThan b shouldBe result
        }
    }
})
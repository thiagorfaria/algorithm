package extention

import io.kotlintest.data.forall
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class CharArrayExtKtTest : StringSpec({

    "should revere array by index" {
        forall(
            row(charArrayOf('t', 'h', 'i', 'a', 'g', 'o'), 0, 5, listOf('o', 'g', 'a', 'i', 'h', 't')),
            row(charArrayOf('t', 'h', 'i', 'a', 'g', 'o'), 4, 2, listOf('t', 'h', 'i', 'a', 'g', 'o')),
            row(charArrayOf('1'), 0, 1, listOf('1')),
            row(charArrayOf(), 0, 0, listOf())
        )
        { chars, startIndex, endIndex, result ->
            chars.reverse(startIndex, endIndex)
            chars.toList() shouldContainExactly result
        }
    }
})
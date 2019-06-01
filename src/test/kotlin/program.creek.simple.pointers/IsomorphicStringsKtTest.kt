package program.creek.simple.pointers

import io.kotlintest.data.suspend.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

/**
 * Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can
 * be replaced to get t.
 *
 *For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 */
class IsomorphicStringsKtTest : StringSpec({


    "should check isomorphic strings" {
        forall(
            row("egg", "add", true),
            row("foo", "bar", false),
            row("bar", "foo", false)
        ) { s, t, result ->
            isIsomorphic(s, t) shouldBe result
            isIsomorphic2(s, t) shouldBe result
        }
    }
})
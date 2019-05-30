package program.creek.simple.pointers

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
 *
 * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
 *
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
class ReverseWordKtTest : StringSpec({

    "should reverse the word" {
        val word = charArrayOf('T','h','i','a','g','o',' ','R','o','d','r','i','g','u','e','s',' ','F','a','r','i','a')
        reverseWord(word)

        val result = listOf('F', 'a', 'r', 'i', 'a', ' ', 'R', 'o', 'd', 'r', 'i', 'g', 'u', 'e', 's', ' ', 'T', 'h', 'i', 'a', 'g', 'o')
        word.toList() shouldContainExactly result

    }

    "should reverse the word to type string" {
        reverseWord("Thiago Rodrigues Faria") shouldBe "Faria Rodrigues Thiago"
        reverseWord("Thiago") shouldBe "Thiago"
        reverseWord("Thiago Faria ") shouldBe "Faria Thiago"
        reverseWord("") shouldBe ""
        reverseWord(" ") shouldBe " "
    }


})
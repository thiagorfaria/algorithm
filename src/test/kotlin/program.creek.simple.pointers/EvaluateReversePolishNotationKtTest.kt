package program.creek.simple.pointers

import io.kotlintest.data.suspend.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /.
 * Each operand may be an integer or another expression. For example:
 *
 *["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
class EvaluateReversePolishNotationKtTest : StringSpec({

    "should evaluate reverse polish notation" {

        forall(
            row(arrayOf("2", "1", "+", "3", "*", "1", "-"), 8),
            row(arrayOf("4", "13", "5", "/", "+"), 6)
        ) { token, result ->
            evalRPN(token) shouldBe result
        }
    }
})
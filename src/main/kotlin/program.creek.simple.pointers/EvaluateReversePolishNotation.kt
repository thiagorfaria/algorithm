package program.creek.simple.pointers

import java.util.Stack

/**
 * Naive Approach
 *
 * This problem can be solved by using a stack. We can loop through each element in the given array. When it is a
 * number, push it to the stack. When it is an operator, pop two numbers from the stack, do the calculation, and push
 * back the result.
 */
fun evalRPN(tokens: Array<String>): Int {

    // space complexity is O(n)
    val stack = Stack<String>()

    // time complexity is O(n)
    tokens.forEach {
        if ("+-*/".contains(it)) {//pop numbers from stack if it is an operator
            val a = Integer.valueOf(stack.pop())
            val b = Integer.valueOf(stack.pop())
            when (it) {
                "+" -> stack.push((a + b).toString())
                "-" -> stack.push((b - a).toString())
                "*" -> stack.push((a * b).toString())
                "/" -> stack.push((b / a).toString())
            }
        } else { //push to stack if it is a number
            stack.push(it)
        }
    }

    return Integer.valueOf(stack.pop())
}

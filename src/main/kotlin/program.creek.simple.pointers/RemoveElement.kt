package program.creek.simple.pointers

/**
 * https://www.programcreek.com/2014/04/leetcode-remove-element-java/
 */
fun removeElement(numbers: IntArray, elem: Int): IntArray {
    var secondary = 0
    var index = 0
    var removed = 0

    // Complexity time O(n)
    while (index < numbers.size) {
        if (numbers[index] != elem) {
            numbers[secondary] = numbers[index]
            secondary++

        } else removed++


        index++
    }

    // Complexity of space O(n)
    return numbers.copyOf(removed)
}

fun removeElementWithLambdaExpression(numbers: IntArray, elem: Int): IntArray {

    // Complexity of space 2 x O(n)
    return  numbers.filter { it != elem }.toIntArray()
}
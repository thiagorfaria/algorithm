package daily.coding.problem

import utils.product

/**
 * Using division to solve the problem
 */
fun productOfNumbersSolution01(numbers: IntArray): String {
    if (numbers.isEmpty())
        return ""
    else if (numbers.size == 1)
        return "${numbers.first()}"

    //time complexity is o(n)
    val total = numbers.product()

    //time complexity is o(n)
    var result = ""
    for (it in numbers)
        result += "${total / it}, "

    return result.dropLast(2)
}


/**
 * This problem would be easy with division: an optimal solution could just find the product of all numbers in the
 * array and then divide by each of the numbers.
 *
 * Without division, another approach would be to first see that the ith element simply needs the product of numbers
 * before i and the product of numbers after i. Then we could multiply those two numbers to get our desired product.
 *
 * In order to find the product of numbers before i, we can generate a list of prefix products. Specifically, the ith
 * element in the list would be a product of all numbers including i. Similarly, we would generate the list of suffix
 * products.
 *
 * This runs in O(N) time and space, since iterating over the input arrays takes O(N) time and creating the prefix and
 * suffix arrays take up O(N) space.
 */
fun productOfNumbersSolution02(numbers: IntArray): String {

    if (numbers.isEmpty())
        return ""
    else if (numbers.size == 1)
        return "${numbers.first()}"

    // time and space complexity is O(n)
    val prefixProducts = mutableListOf(numbers.first())
    numbers.drop(1).forEach {
        prefixProducts.add(it * prefixProducts.last())
    }

    // time and space complexity is O(n)
    val suffixProducts = mutableListOf(numbers.last())
    numbers.reversed().drop(1).forEach {
        suffixProducts.add(it * suffixProducts.last())
    }

    // time and space complexity is O(n)
    suffixProducts.reverse()

    // time complexity is O(n)
    var result = ""
    for (i in 0 until numbers.size) {
        result += when (i) {
            0 -> "${suffixProducts[i + 1]}, "
            numbers.size - 1 -> "${prefixProducts[i - 1]}, "
            else -> "${suffixProducts[i + 1] * prefixProducts[i - 1]}, "
        }
    }

    return result.dropLast(2)
}
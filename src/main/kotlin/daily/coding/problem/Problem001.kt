package daily.coding.problem

class Problem001 {

}

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
fun problem001(numbers: IntArray, k: Int) : Boolean {

    // Complexity is O(n^2)
    for (i in 0 until (numbers.size - 1)) {
        for (b in (i + 1) until numbers.size) {
            if (numbers[i] + numbers[b] == k) {
                return true
            }
        }
    }





    return false


}
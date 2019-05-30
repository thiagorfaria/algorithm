package program.creek.simple.pointers

import utils.reverse


/**
 * https://www.programcreek.com/2015/03/rotate-array-in-java/
 *
 * In a straightforward way, we can create a new array and then copy elements to the new array. Then change the
 * original array by using System.arraycopy().
 */
fun intermediateRotateArray(numbers: IntArray, k: Int) {

    var t = k
    if (k > numbers.size)
        t = k % numbers.size

    // space complexity is O(n)
    val result = IntArray(numbers.size)

    // time complexity is O(n)
    for (i in 0 until t)
        result[i] = numbers[numbers.size - t + i]

    // time complexity is O(n)
    for ((j, i) in (t until numbers.size).withIndex())
        result[i] = numbers[j]

    System.arraycopy(result, 0, numbers, 0, numbers.size)
}

/**
 * Can we do this in O(1) space?
 *
 * This solution is like a bubble sort.
 * However, the time is O(n*k).
 */
fun bubbleRotateArray(numbers: IntArray, k: Int) {

    var t = k
    if (k > numbers.size)
        t = k % numbers.size


    // time complexity is O(n*k)
    for (i in 0 until t)
        for (j in numbers.size - 1 downTo 1) {
            val temp = numbers[j]
            numbers[j] = numbers[j - 1]
            numbers[j - 1] = temp
        }
}

/**
 * Can we do this in O(1) space and in O(n) time? The following solution does.
 */
fun reversalRotateArray(numbers: IntArray, k: Int) {

    var t = k
    if (k > numbers.size)
        t = k % numbers.size

    //size of first part
    val a = numbers.size - t

    // space complexity is O(1)
    // time complexity is O(n)
    numbers.reverse(0, a - 1)
    numbers.reverse(a, numbers.size - 1)
    numbers.reverse(0, numbers.size - 1)
}
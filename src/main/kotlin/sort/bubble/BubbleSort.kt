package sort.bubble

import extention.lessThan
import extention.swap

// Brute force
fun bubbleSortMegaBruteForce(numbers: IntArray): Int {
    var count = 0
    for (i in numbers.indices)
        for (n in 1 until numbers.size){
            if (numbers[n] lessThan numbers[n - 1]) numbers.swap(n, n - 1)

            count++
        }
    return count
}

fun bubbleSortBruteForce(numbers: IntArray): Int {
    var size = numbers.size
    var count = 0
    for (i in 1 until numbers.size) {
        var swap = false
        for (n in 1 until size) {
            if (numbers[n] lessThan numbers[n - 1]) {
                numbers.swap(n, n - 1)
                swap = true
            }
            count++
        }
        if (swap) size--
    }

    return count
}

fun bubbleSort(numbers: IntArray): Int {
    var size = numbers.size
    var i = 0
    var count = 0

    while (i < numbers.size) {
        var swap = false
        for (n in 1 until size) {
            if (numbers[n] lessThan numbers[n - 1]) {
                numbers.swap(n, n - 1)
                size = n
                swap = true
            }
            count++
        }

        if (swap) i++ else i = numbers.size
    }

    return count
}

fun main() {
    val numbers = intArrayOf(1, 2, 8, 5, 3, 9, 4, 6)
    bubbleSort(numbers)
    println(numbers.toList())
}


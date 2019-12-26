package sort

import extention.swap

// Brute force
fun insertionBruteSort(numbers: IntArray) {

    for (i in 1 until numbers.size) {
        for (n in 0..i) {
            if (numbers[n] > numbers[i]) {
                numbers.swap(n, i)
            }
        }
    }
}

fun insertionSort(numbers: IntArray) {
    for (i in 1 until numbers.size) {
        insertionSwap(numbers, i)
    }
}

fun insertionSwap(numbers: IntArray, index: Int) {
    var n = index - 1
    val temp = numbers[index]

    while (n >= 0 && numbers[n] > temp) {
        numbers[n + 1] = numbers[n]
        n--
    }
    numbers[n + 1] = temp
}


fun main() {
    insertionBruteSort(intArrayOf(3, 7, 4, 9, 5, 2, 6, 1))

    val numbers = intArrayOf(3, 7, 4, 9, 5, 2, 6, 1)
    println(insertionSort(numbers))
    println(numbers.toList())
}
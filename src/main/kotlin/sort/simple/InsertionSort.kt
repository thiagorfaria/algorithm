package sort.simple

import extention.greatThan
import extention.swap

// Brute force
fun insertionBruteSort(numbers: IntArray) {

    for (i in 1 until numbers.size)
        for (n in 0..i)
            if (numbers[n] greatThan numbers[i]) numbers.swap(n, i)
}

fun insertionSort(numbers: IntArray) {
    for (i in 1 until numbers.size)
        insertionSwap(numbers, i)
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
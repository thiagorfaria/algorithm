package sort

import extention.swap

fun selectionSort(numbers: IntArray) {
    for (i in numbers.indices) {
        var s = i
        for (n in (i + 1) until numbers.size) {
            if (numbers[n] < numbers[s]) {
                s = n
            }
        }

        numbers.swap(i, s)
    }
}


fun main() {
    val numbers = intArrayOf(3, 7, 4, 9, 5, 2, 6, 1)
    println(selectionSort(numbers))
    println(numbers.toList())
}
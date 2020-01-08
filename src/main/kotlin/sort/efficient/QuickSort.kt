package sort.efficient

import extention.swap

fun quickSort(numbers: IntArray) {
    sort(numbers, 0, numbers.size - 1)
}

private fun sort(numbers: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(numbers, low, high)
        if (low + 2 < pivotIndex)
            sort(numbers, low, pivotIndex)

        if (pivotIndex + 2 < high)
            sort(numbers, pivotIndex + 1, high)
    }
}

private fun partition(numbers: IntArray, low: Int, high: Int): Int {
//    val pivot = numbers[low + (high - low) / 2]
    val pivot = medianOfThree(numbers, low, high)

    var l = low
    var h = high

    while (l < h) {
        while (numbers[l] < pivot) l++
        while (numbers[h] > pivot) h--

        numbers.swap(l, h)
    }

    return h
}

fun medianOfThree(numbers: IntArray, low: Int, high: Int): Int {
    val mid = (low + high) / 2
    if (numbers[low] > numbers[mid]) numbers.swap(low, mid)

    if (numbers[mid] > numbers[high]) numbers.swap(mid, high)

    if (numbers[low] > numbers[mid]) numbers.swap(low, mid)

    return numbers[mid]
}

fun main() {
    val numbers = intArrayOf(7, 2, 4, 3, 0, 5, 8, 6, 1, 9, 10)
    quickSort(numbers)
    println(numbers.toList())
}

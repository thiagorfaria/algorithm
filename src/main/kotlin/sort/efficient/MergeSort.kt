package sort.efficient

fun mergeSort(numbers: IntArray): Int {
    val count = 0

    //TODO
    return count
}

fun sort(numbers: IntArray, i: Int) {
    val m = i / 2

    sort(numbers, m)
}

fun main() {
    val numbers = intArrayOf(1, 2, 8, 5, 3, 9, 4, 6)
    mergeSort(numbers)
    println(numbers.toList())
}


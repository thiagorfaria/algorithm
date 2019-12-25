package sort

// Brute force
fun bruteSort(numbers: IntArray) {

    for (i in 1 until numbers.size) {
        for (n in 0..i) {
            if (numbers[n] > numbers[i]) {
                val temp = numbers[n]
                numbers[n] = numbers[i]
                numbers[i] = temp
            }
        }
    }
}

fun sort(numbers: IntArray) {
    for (i in 1 until numbers.size) {
        swap(numbers, i)
    }
}

fun swap(numbers: IntArray, index: Int) {
    var n = index - 1
    val temp = numbers[index]

    while (n >= 0 && numbers[n] > temp) {
        numbers[n + 1] = numbers[n]
        n--
    }
    numbers[n + 1] = temp
}


fun main() {
    bruteSort(intArrayOf(3, 7, 4, 9, 5, 2, 6, 1))

    val numbers = intArrayOf(3, 7, 4, 9, 5, 2, 6, 1)
    println(sort(numbers))
    println(numbers.toList())
}
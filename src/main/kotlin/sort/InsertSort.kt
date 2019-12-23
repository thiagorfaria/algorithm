package sort

// Brute force
fun bruteInsertSort(numbers: IntArray) : Int {

    var count = 1
    for (i in 1 until numbers.size) {

        for (n in 0..i) {
            if (numbers[n] > numbers[i]) {
                val temp = numbers[n]
                numbers[n] = numbers[i]
                numbers[i] = temp
            }
            count++
        }
    }
    return count
}

fun insertSort(numbers: IntArray) : Int {

    var count = 1
    for (i in 1 until numbers.size) {
        count++
    }
    return count
}

fun main() {
    bruteInsertSort(intArrayOf(3, 7, 4, 9, 5, 2, 6, 1))
    println(insertSort(intArrayOf(3, 7, 4, 9, 5, 2, 6, 1)))
}
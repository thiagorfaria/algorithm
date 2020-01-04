package search

fun search(numbers: IntArray, number: Int): Boolean {

    var low = 0
    var high = numbers.size - 1

    while (low <= high) {
        val mid = (low + high) / 2
        val guess = numbers[mid]

        if (guess == number) return true

        if (guess > number) high = mid - 1
        else low = mid + 1
    }

    return false
}

fun main() {
    search(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), 2)
}
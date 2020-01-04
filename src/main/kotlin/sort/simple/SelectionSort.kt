package sort.simple

import extention.lessThan
import extention.swap

fun selectionSort(numbers: IntArray) {
    for (i in numbers.indices) {
        var s = i
        for (n in (i + 1) until numbers.size)
            if (numbers[n] lessThan numbers[s]) s = n

        numbers.swap(i, s)
    }
}
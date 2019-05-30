package extention

/**
 * Reverses elements in the array in-place from start index until end index.
 *
 * @param startIndex the start index (inclusive).
 * @param endIndex the end index (exclusive).
*/
fun CharArray.reverse(startIndex: Int, endIndex: Int) {
    var l = startIndex
    var r = endIndex

    if (this.size > 1)
        while (l < r) {
            val temp = this[l]
            this[l] = this[r]
            this[r] = temp
            l++
            r--
        }
}
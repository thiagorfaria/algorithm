package br.com.trf.algorithm.program.creek.simple.pointers

/**
 * https://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-java/
 */
fun removeDuplicates(intNumbers: IntArray): IntArray {
    if (intNumbers.size < 2)
        return intNumbers

    var index = 0
    var indexPrevious = 0

    // Complexity time O(n)
    while (indexPrevious < intNumbers.size) {
        if (intNumbers[indexPrevious] != intNumbers[index]) {
            index++
            intNumbers[index] = intNumbers[indexPrevious]
        }

        indexPrevious++
    }

    // Complexity space O(n)
    return intNumbers.copyOf(index + 1)
}

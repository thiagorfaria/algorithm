package program.creek.simple.pointers

import java.util.HashMap
import java.util.HashSet


/**
 *
 * We can define a map which tracks the char-char mappings. If a value is already mapped, it can not be mapped again.
 */
fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false

    // space complexity is O(n)
    val map1 = HashMap<Char, Char>()
    val map2 = HashMap<Char, Char>()

    // time complexity is O(n)
    s.indices.forEach {
        val c1 = s[it]
        val c2 = t[it]

        if (map1.containsKey(c1)) {
            if (c2 != map1[c1])
                return false

        } else {
            if (map2.containsKey(c2))
                return false

            map1[c1] = c2
            map2[c2] = c1
        }
    }

    return true
}

/**
 * We can also simply check if a value is mapped twice by checking the number of unique elements.
 */
fun isIsomorphic2(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false

    // space complexity is O(n)
    val map = HashMap<Char, Char>()

    // time complexity is O(n)
    s.indices.forEach {
        val c1 = s[it]
        val c2 = t[it]

        if (map.containsKey(c1)) {
            if (map[c1] != c2)
                return false

        } else
            map[c1] = c2
    }

    return HashSet(map.values).size == map.size

}


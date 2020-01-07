package recursion

fun fact(n: Int): Int = if (n == 1) 1 else n * fact(n - 1)
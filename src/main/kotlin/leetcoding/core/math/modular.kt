package leetcoding.core.math

const val DEFAULT_MOD = 1_000_000_007

fun modSum(n1: Int, n2: Int, mod: Int = DEFAULT_MOD): Int = (n1 + n2) % mod

fun modProduct(n1: Int, n2: Int, mod: Int = DEFAULT_MOD): Int = when {
    n1 == 0 -> 0
    n1 % 2 == 0 -> modProduct(n1 / 2, n2 * 2 % mod, mod)
    else -> modSum(n2, modProduct(n1 - 1, n2, mod), mod)
}

fun Iterable<Int>.modProduct(mod: Int = DEFAULT_MOD): Int = this.reduceOrNull { acc, i -> modProduct(acc, i, mod) } ?: 1
fun IntArray.modProduct(mod: Int = DEFAULT_MOD): Int = this.reduceOrNull { acc, i -> modProduct(acc, i, mod) } ?: 1
fun Iterable<Int>.modSum(mod: Int = DEFAULT_MOD): Int = this.reduceOrNull { acc, i -> modSum(acc, i, mod) } ?: 0
fun IntArray.modSum(mod: Int = DEFAULT_MOD): Int = this.reduceOrNull { acc, i -> modSum(acc, i, mod) } ?: 0

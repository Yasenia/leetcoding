package leetcoding.algorithms.problem1017

class Solution1 : Solution {

    override fun baseNeg2(n: Int): String = baseNeg2(n, "")

    private tailrec fun baseNeg2(n: Int, suffix: String): String = when {
        n == 0 -> suffix.ifEmpty { "0" }
        n % 2 == 0 -> baseNeg2(n / -2, "0$suffix")
        else -> baseNeg2((n - 1) / -2, "1$suffix")
    }
}

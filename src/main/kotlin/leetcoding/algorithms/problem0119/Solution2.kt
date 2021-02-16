package leetcoding.algorithms.problem0119

class Solution2 : Solution {

    override fun getRow(rowIndex: Int): List<Int> = (0..rowIndex).map { combNumber(it, rowIndex, 1, 1) }

    private tailrec fun combNumber(m: Int, n: Int, denAcc: Int, molAcc: Int): Int = when {
        m < 0 -> throw AssertionError()
        m == 0 -> molAcc / denAcc
        m > n / 2 -> combNumber(n - m, n, denAcc, molAcc)
        else -> {
            val gcd = gcd(denAcc * m, molAcc * n)
            combNumber(m - 1, n - 1, denAcc * m / gcd, molAcc * n / gcd)
        }
    }

    private fun gcd(a: Int, b: Int): Int = when {
        b == 0 -> a
        a < b -> gcd(b, a)
        else -> gcd(b, a % b)
    }
}

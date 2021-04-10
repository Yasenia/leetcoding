package leetcoding.algorithms.problem0264

class Solution2 : Solution {

    override fun nthUglyNumber(n: Int): Int {
        val dp = IntArray(n) { 1 }
        var x = 0
        var y = 0
        var z = 0
        for (i in 1..dp.lastIndex) {
            dp[i] = minOf(dp[x] * 2, dp[y] * 3, dp[z] * 5)
            if (dp[i] == dp[x] * 2) x++
            if (dp[i] == dp[y] * 3) y++
            if (dp[i] == dp[z] * 5) z++
        }
        return dp.last()
    }
}

package leetcoding.algorithms.problem0264

import kotlin.math.abs

class Solution1 : Solution {

    override fun nthUglyNumber(n: Int): Int {
        val dp = IntArray(n) { 1 }
        for (i in 1..dp.lastIndex) {
            val pre = dp[i - 1]
            val x = dp[abs(dp.binarySearch(pre / 2, 0, i) + 1)] * 2
            val y = dp[abs(dp.binarySearch(pre / 3, 0, i) + 1)] * 3
            val z = dp[abs(dp.binarySearch(pre / 5, 0, i) + 1)] * 5
            dp[i] = minOf(x, y, z)
        }
        return dp.last()
    }
}

package leetcoding.algorithms.problem0354

class Solution2 : Solution {

    override fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        val heights = envelopes.sortedWith { e1, e2 -> if (e1[0] != e2[0]) e1[0] - e2[0] else e2[1] - e1[1] }.map { it[1] }
        var max = 0
        val dp = IntArray(envelopes.size)
        for (i in dp.indices) {
            var iMax = 1
            for (j in 0 until i) if (heights[j] < heights[i]) iMax = iMax.coerceAtLeast(dp[j] + 1)
            dp[i] = iMax
            max = max.coerceAtLeast(iMax)
        }
        return max
    }
}

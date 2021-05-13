package leetcoding.algorithms.problem1269

import leetcoding.core.math.modSum

class Solution1 : Solution {

    override fun numWays(steps: Int, arrLen: Int): Int = numWays(steps, arrLen, 0, Array(steps) { mutableMapOf() })

    private fun numWays(steps: Int, arrLen: Int, i: Int, dp: Array<MutableMap<Int, Int>>): Int {
        if (steps == 0) return if (i == 0) 1 else 0
        if (dp[steps - 1][i] != null) return dp[steps - 1][i]!!
        var acc = numWays(steps - 1, arrLen, i, dp)
        if (i > 0) acc = modSum(acc, numWays(steps - 1, arrLen, i - 1, dp))
        if (i < arrLen - 1) acc = modSum(acc, numWays(steps - 1, arrLen, i + 1, dp))
        dp[steps - 1][i] = acc
        return acc
    }
}

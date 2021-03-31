package leetcoding.algorithms.problem1155

import leetcoding.core.math.modSum

class Solution1 : Solution {

    override fun numRollsToTarget(d: Int, f: Int, target: Int): Int =
        numRollsToTarget(d, f, target, Array(d + 1) { IntArray(target + 1) { -1 } })

    private fun numRollsToTarget(d: Int, f: Int, target: Int, dp: Array<IntArray>): Int {
        if (dp[d][target] < 0) dp[d][target] = when {
            target !in d..(d * f) -> 0
            d == 0 -> 1
            else -> (1..f.coerceAtMost(target))
                .map { numRollsToTarget(d - 1, f, target - it, dp) }
                .modSum()
        }
        return dp[d][target]
    }
}

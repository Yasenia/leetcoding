package leetcoding.algorithms.problem0354

class Solution1 : Solution {

    override fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        var max = 0
        val dp = IntArray(envelopes.size)
        for (i in envelopes.indices) max = max.coerceAtLeast(maxEnvelopesFrom(envelopes, dp, i))
        return max
    }

    private fun maxEnvelopesFrom(envelopes: Array<IntArray>, dp: IntArray, index: Int): Int {
        if (dp[index] > 0) return dp[index]
        var max = 1
        for (i in envelopes.indices) {
            if (envelopes[i][0] <= envelopes[index][0] || envelopes[i][1] <= envelopes[index][1]) continue
            max = max.coerceAtLeast(maxEnvelopesFrom(envelopes, dp, i) + 1)
        }
        dp[index] = max
        return max
    }
}

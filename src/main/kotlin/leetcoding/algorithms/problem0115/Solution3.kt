package leetcoding.algorithms.problem0115

class Solution3 : Solution {

    override fun numDistinct(s: String, t: String): Int {
        val dp = IntArray(t.length + 1).also { it[0] = 1 }
        for (c in s) {
            for (j in t.length downTo 1) {
                if (c == t[j - 1]) dp[j] += dp[j - 1]
            }
        }
        return dp[t.length]
    }
}

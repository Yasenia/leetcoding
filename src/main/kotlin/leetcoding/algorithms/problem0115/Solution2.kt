package leetcoding.algorithms.problem0115

class Solution2 : Solution {

    override fun numDistinct(s: String, t: String): Int {
        val dp = Array(s.length + 1) { IntArray(t.length + 1).apply { set(t.length, 1) } }
        for (i in s.indices.reversed()) {
            for (j in t.indices.reversed()) {
                dp[i][j] = dp[i + 1][j] + if (s[i] == t[j]) dp[i + 1][j + 1] else 0
            }
        }
        return dp[0][0]
    }
}

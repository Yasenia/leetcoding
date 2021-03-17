package leetcoding.algorithms.problem0115

class Solution1 : Solution {

    override fun numDistinct(s: String, t: String): Int = numDistinct(s, t, 0, 0, Array(s.length) { IntArray(t.length) { -1 } })

    private fun numDistinct(s: String, t: String, i: Int, j: Int, dp: Array<IntArray>): Int {
        if (j > t.lastIndex) return 1
        if (i > s.lastIndex) return 0
        if (dp[i][j] < 0) {
            dp[i][j] = numDistinct(s, t, i + 1, j, dp) + if (s[i] == t[j]) numDistinct(s, t, i + 1, j + 1, dp) else 0
        }
        return dp[i][j]
    }
}

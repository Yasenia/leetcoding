package leetcoding.algorithms.problem1143

class Solution1 : Solution {

    override fun longestCommonSubsequence(text1: String, text2: String): Int {
        val dp = Array(text1.length + 1) { IntArray(text2.length + 1) }
        for (i in text1.indices) {
            for (j in text2.indices) {
                dp[i + 1][j + 1] = if (text1[i] == text2[j]) dp[i][j] + 1 else maxOf(dp[i + 1][j], dp[i][j + 1])
            }
        }
        return dp.lastOrNull()?.lastOrNull() ?: 0
    }
}

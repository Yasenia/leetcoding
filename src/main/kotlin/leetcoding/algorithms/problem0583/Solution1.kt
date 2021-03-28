package leetcoding.algorithms.problem0583

class Solution1 : Solution {

    override fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word1.length + 1) { IntArray(word2.length + 1) }
        for (i in dp.indices) {
            for (j in dp[i].indices) {
                dp[i][j] = when {
                    i == 0 || j == 0 -> i + j
                    word1[i - 1] == word2[j - 1] -> dp[i - 1][j - 1]
                    else -> minOf(dp[i][j - 1], dp[i - 1][j]) + 1
                }
            }
        }
        return dp.lastOrNull()?.lastOrNull() ?: 0
    }
}

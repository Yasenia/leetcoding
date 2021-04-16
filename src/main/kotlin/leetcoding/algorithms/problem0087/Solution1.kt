package leetcoding.algorithms.problem0087

class Solution1 : Solution {

    override fun isScramble(s1: String, s2: String): Boolean =
        s1.length == s2.length && isScramble(s1, s2, 0, 0, s1.length, Array(s1.length) { Array(s1.length) { Array(s1.length) { null } } })

    private fun isScramble(s1: String, s2: String, i: Int, j: Int, length: Int, dp: Array<Array<Array<Boolean?>>>): Boolean {
        if (length == 1) return s1[i] == s2[j]
        if (dp[i][j][length - 1] == null) dp[i][j][length - 1] = (1 until length).any {
            isScramble(s1, s2, i, j, it, dp) && isScramble(s1, s2, i + it, j + it, length - it, dp) ||
                isScramble(s1, s2, i, j + length - it, it, dp) && isScramble(s1, s2, i + it, j, length - it, dp)
        }
        return dp[i][j][length - 1]!!
    }
}

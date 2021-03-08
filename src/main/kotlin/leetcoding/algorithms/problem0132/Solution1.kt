package leetcoding.algorithms.problem0132

class Solution1 : Solution {

    override fun minCut(s: String): Int = minCut(s, IntArray(s.length) { -1 }, 0)

    private fun minCut(s: String, dp: IntArray, i: Int): Int {
        if (i > s.lastIndex) return -1
        if (dp[i] >= 0) return dp[i]
        var min = s.lastIndex - i
        for (j in i..s.lastIndex) if (isPalindrome(s, i, j)) min = min.coerceAtMost(1 + minCut(s, dp, j + 1))
        dp[i] = min
        return min
    }

    private tailrec fun isPalindrome(s: String, start: Int, end: Int): Boolean = when {
        start >= end -> true
        s[start] != s[end] -> false
        else -> isPalindrome(s, start + 1, end - 1)
    }
}

package leetcoding.algorithms.problem0131

class Solution1 : Solution {

    override fun partition(s: String): List<List<String>> = partition(s, Array(s.length) { null }, 0)

    private fun partition(s: String, dp: Array<List<List<String>>?>, i: Int): List<List<String>> =
        if (i > s.lastIndex) listOf(emptyList())
        else dp[i] ?: (i..s.lastIndex).filter { isPalindrome(s, i, it) }.flatMap { j ->
            val palindrome = listOf(s.substring(i, j + 1))
            partition(s, dp, j + 1).map { palindrome + it }
        }.also { dp[i] = it }

    private tailrec fun isPalindrome(s: String, start: Int, end: Int): Boolean = when {
        start >= end -> true
        s[start] != s[end] -> false
        else -> isPalindrome(s, start + 1, end - 1)
    }
}

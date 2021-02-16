package leetcoding.algorithms.problem0005

import leetcoding.core.ISolution

/**
 * [Problem 5](https://leetcode.com/problems/longest-palindromic-substring/)
 */
interface Solution : ISolution<String, String> {

    override fun solve(input: String): String = longestPalindrome(input)

    fun longestPalindrome(s: String): String
}

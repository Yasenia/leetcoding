package leetcoding.algorithms.problem0003

import leetcoding.core.ISolution

/**
 * [Problem 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = lengthOfLongestSubstring(input)

    fun lengthOfLongestSubstring(s: String): Int
}

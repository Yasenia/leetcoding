package leetcoding.algorithms.problem0395

import leetcoding.core.ISolution

/**
 * [Problem 395](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/)
 * */
interface Solution : ISolution<Pair<String, Int>, Int> {

    override fun solve(input: Pair<String, Int>): Int = longestSubstring(input.first, input.second)

    fun longestSubstring(s: String, k: Int): Int
}

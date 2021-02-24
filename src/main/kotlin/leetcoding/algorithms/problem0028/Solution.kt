package leetcoding.algorithms.problem0028

import leetcoding.core.ISolution

/**
 * [Problem 28](https://leetcode.com/problems/implement-strstr/)
 * */
interface Solution : ISolution<Pair<String, String>, Int> {

    override fun solve(input: Pair<String, String>): Int = strStr(input.first, input.second)

    fun strStr(haystack: String, needle: String): Int
}

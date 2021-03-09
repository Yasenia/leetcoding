package leetcoding.algorithms.problem0032

import leetcoding.core.ISolution

/**
 * [Problem 32](https://leetcode.com/problems/longest-valid-parentheses/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = longestValidParentheses(input)

    fun longestValidParentheses(s: String): Int
}

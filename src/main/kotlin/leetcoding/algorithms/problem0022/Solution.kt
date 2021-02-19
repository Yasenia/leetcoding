package leetcoding.algorithms.problem0022

import leetcoding.core.ISolution

/**
 * [Problem 22](https://leetcode.com/problems/generate-parentheses/)
 * */
interface Solution : ISolution<Int, Set<String>> {

    override fun solve(input: Int): Set<String> = generateParenthesis(input).toSet()

    fun generateParenthesis(n: Int): List<String>
}

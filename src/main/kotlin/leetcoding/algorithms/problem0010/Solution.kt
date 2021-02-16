package leetcoding.algorithms.problem0010

import leetcoding.core.ISolution

/**
 * [Problem 10](https://leetcode.com/problems/regular-expression-matching/)
 * */
interface Solution : ISolution<Pair<String, String>, Boolean> {

    override fun solve(input: Pair<String, String>): Boolean = isMatch(input.first, input.second)

    fun isMatch(s: String, p: String): Boolean
}

package leetcoding.algorithms.problem0115

import leetcoding.core.ISolution

/**
 * [Problem 0115](https://leetcode.com/problems/distinct-subsequences/)
 * */
interface Solution : ISolution<Pair<String, String>, Int> {

    override fun solve(input: Pair<String, String>): Int = numDistinct(input.first, input.second)

    fun numDistinct(s: String, t: String): Int
}

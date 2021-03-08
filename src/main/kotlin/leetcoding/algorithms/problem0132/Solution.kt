package leetcoding.algorithms.problem0132

import leetcoding.core.ISolution

/**
 * [Problem 132](https://leetcode.com/problems/palindrome-partitioning-ii/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = minCut(input)

    fun minCut(s: String): Int
}

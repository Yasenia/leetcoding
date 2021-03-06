package leetcoding.algorithms.problem0131

import leetcoding.core.ISolution

/**
 * [Problem 131](https://leetcode.com/problems/palindrome-partitioning/)
 * */
interface Solution : ISolution<String, Set<List<String>>> {

    override fun solve(input: String): Set<List<String>> = partition(input).toSet()

    fun partition(s: String): List<List<String>>
}

package leetcoding.algorithms.problem0014

import leetcoding.core.ISolution

/**
 * [Problem 14](https://leetcode.com/problems/longest-common-prefix/)
 * */
interface Solution : ISolution<Array<String>, String> {

    override fun solve(input: Array<String>): String = longestCommonPrefix(input)

    fun longestCommonPrefix(strArray: Array<String>): String
}

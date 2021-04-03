package leetcoding.algorithms.problem1143

import leetcoding.core.ISolution

/**
 * [Problem 1143](https://leetcode.com/problems/longest-common-subsequence/)
 * */
interface Solution : ISolution<Pair<String, String>, Int> {

    override fun solve(input: Pair<String, String>): Int = longestCommonSubsequence(input.first, input.second)

    fun longestCommonSubsequence(text1: String, text2: String): Int
}

package leetcoding.algorithms.problem0091

import leetcoding.core.ISolution

/**
 * [Problem 91](https://leetcode.com/problems/decode-ways/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = numDecodings(input)

    fun numDecodings(s: String): Int
}

package leetcoding.algorithms.problem0013

import leetcoding.core.ISolution

/**
 * [Problem 13](https://leetcode.com/problems/roman-to-integer/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = romanToInt(input)

    fun romanToInt(s: String): Int
}

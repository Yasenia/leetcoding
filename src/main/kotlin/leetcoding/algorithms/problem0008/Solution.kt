package leetcoding.algorithms.problem0008

import leetcoding.core.ISolution

/**
 * [Problem 8](https://leetcode.com/problems/string-to-integer-atoi/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = myAtoi(input)

    fun myAtoi(s: String): Int
}

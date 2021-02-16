package leetcoding.algorithms.problem0012

import leetcoding.core.ISolution

/**
 * [Problem 12](https://leetcode.com/problems/integer-to-roman/)
 * */
interface Solution : ISolution<Int, String> {

    override fun solve(input: Int): String = intToRoman(input)

    fun intToRoman(num: Int): String
}

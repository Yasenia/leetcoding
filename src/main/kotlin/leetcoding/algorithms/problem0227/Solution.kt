package leetcoding.algorithms.problem0227

import leetcoding.core.ISolution

/**
 * [Problem 227](https://leetcode.com/problems/basic-calculator-ii/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = calculate(input)

    fun calculate(s: String): Int
}

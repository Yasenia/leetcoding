package leetcoding.algorithms.problem0224

import leetcoding.core.ISolution

/**
 * [Problem 224](https://leetcode.com/problems/basic-calculator/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = calculate(input)

    fun calculate(s: String): Int
}

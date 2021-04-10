package leetcoding.algorithms.problem0263

import leetcoding.core.ISolution

/**
 * [Problem 263](https://leetcode.com/problems/ugly-number/)
 * */
interface Solution : ISolution<Int, Boolean> {

    override fun solve(input: Int): Boolean = isUgly(input)

    fun isUgly(n: Int): Boolean
}

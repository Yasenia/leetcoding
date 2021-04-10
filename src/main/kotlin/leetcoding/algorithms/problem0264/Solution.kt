package leetcoding.algorithms.problem0264

import leetcoding.core.ISolution

/**
 * [Problem 264](https://leetcode.com/problems/ugly-number-ii/)
 * */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = nthUglyNumber(input)

    fun nthUglyNumber(n: Int): Int
}

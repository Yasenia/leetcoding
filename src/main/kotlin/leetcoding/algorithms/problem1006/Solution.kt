package leetcoding.algorithms.problem1006

import leetcoding.core.ISolution

/**
 * [Problem 1006](https://leetcode.com/problems/clumsy-factorial/)
 * */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = clumsy(input)

    fun clumsy(n: Int): Int
}

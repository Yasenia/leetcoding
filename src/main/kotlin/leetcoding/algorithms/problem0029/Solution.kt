package leetcoding.algorithms.problem0029

import leetcoding.core.ISolution

/**
 * [Problem 29](https://leetcode.com/problems/divide-two-integers/)
 * */
interface Solution : ISolution<Pair<Int, Int>, Int> {

    override fun solve(input: Pair<Int, Int>): Int = divide(input.first, input.second)

    fun divide(dividend: Int, divisor: Int): Int
}

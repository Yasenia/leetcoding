package leetcoding.algorithms.problem0191

import leetcoding.core.ISolution

/**
 * [Problem 191](https://leetcode.com/problems/number-of-1-bits/)
 * */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = hammingWeight(input)

    fun hammingWeight(n: Int): Int
}

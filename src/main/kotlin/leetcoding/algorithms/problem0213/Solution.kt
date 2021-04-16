package leetcoding.algorithms.problem0213

import leetcoding.core.ISolution

/**
 * [Problem 213](https://leetcode.com/problems/house-robber-ii/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = rob(input)

    fun rob(nums: IntArray): Int
}

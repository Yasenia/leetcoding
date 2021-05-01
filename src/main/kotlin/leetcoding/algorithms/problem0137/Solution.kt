package leetcoding.algorithms.problem0137

import leetcoding.core.ISolution

/**
 * [Problem 137](https://leetcode.com/problems/single-number-ii/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = singleNumber(input)

    fun singleNumber(nums: IntArray): Int
}

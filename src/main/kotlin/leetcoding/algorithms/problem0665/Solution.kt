package leetcoding.algorithms.problem0665

import leetcoding.core.ISolution

/**
 * [Problem 665](https://leetcode.com/problems/non-decreasing-array/)
 * */
interface Solution : ISolution<IntArray, Boolean> {

    override fun solve(input: IntArray): Boolean = checkPossibility(input)

    fun checkPossibility(nums: IntArray): Boolean
}

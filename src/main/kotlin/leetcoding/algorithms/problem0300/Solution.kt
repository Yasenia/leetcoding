package leetcoding.algorithms.problem0300

import leetcoding.core.ISolution

/**
 * [Problem 300](https://leetcode.com/problems/longest-increasing-subsequence/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = lengthOfLIS(input)

    fun lengthOfLIS(nums: IntArray): Int
}

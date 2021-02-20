package leetcoding.algorithms.problem0697

import leetcoding.core.ISolution

/**
 * [Problem 697](https://leetcode.com/problems/degree-of-an-array/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = findShortestSubArray(input)

    fun findShortestSubArray(nums: IntArray): Int
}

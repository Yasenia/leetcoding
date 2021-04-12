package leetcoding.algorithms.problem0179

import leetcoding.core.ISolution

/**
 * [Problem 179](https://leetcode.com/problems/largest-number/)
 * */
interface Solution : ISolution<IntArray, String> {

    override fun solve(input: IntArray): String = largestNumber(input)

    fun largestNumber(nums: IntArray): String
}

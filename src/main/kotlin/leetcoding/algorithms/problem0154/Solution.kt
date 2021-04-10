package leetcoding.algorithms.problem0154

import leetcoding.core.ISolution

/**
 * [Problem 154](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = findMin(input)

    fun findMin(nums: IntArray): Int
}

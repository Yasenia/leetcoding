package leetcoding.algorithms.problem0153

import leetcoding.core.ISolution

/**
 * [Problem 153](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = findMin(input)

    fun findMin(nums: IntArray): Int
}

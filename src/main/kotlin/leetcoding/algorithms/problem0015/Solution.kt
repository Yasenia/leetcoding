package leetcoding.algorithms.problem0015

import leetcoding.core.ISolution

/**
 * [Problem 15](https://leetcode.com/problems/3sum/)
 * */
interface Solution : ISolution<IntArray, List<List<Int>>> {

    override fun solve(input: IntArray): List<List<Int>> = threeSum(input)

    fun threeSum(nums: IntArray): List<List<Int>>
}

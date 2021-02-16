package leetcoding.algorithms.problem0561

import leetcoding.core.ISolution

/**
 * [Problem 561](https://leetcode.com/problems/array-partition-i/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = arrayPairSum(input)

    fun arrayPairSum(nums: IntArray): Int
}

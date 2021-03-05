package leetcoding.algorithms.problem0523

import leetcoding.core.ISolution

/**
 * [Problem 523](https://leetcode.com/problems/continuous-subarray-sum/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Boolean> {

    override fun solve(input: Pair<IntArray, Int>): Boolean = checkSubarraySum(input.first, input.second)

    fun checkSubarraySum(nums: IntArray, k: Int): Boolean
}

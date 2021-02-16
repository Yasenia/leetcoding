package leetcoding.algorithms.problem0001

import leetcoding.core.ISolution

/**
 * [Problem 1](https://leetcode.com/problems/two-sum/)
 */
interface Solution : ISolution<Pair<IntArray, Int>, IntArray> {

    override fun solve(input: Pair<IntArray, Int>): IntArray = twoSum(input.first, input.second)

    fun twoSum(nums: IntArray, target: Int): IntArray
}

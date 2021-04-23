package leetcoding.algorithms.problem0368

import leetcoding.core.ISolution

/**
 * [Problem 368](https://leetcode.com/problems/largest-divisible-subset/)
 * */
interface Solution : ISolution<IntArray, List<Int>> {

    override fun solve(input: IntArray): List<Int> = largestDivisibleSubset(input)

    fun largestDivisibleSubset(nums: IntArray): List<Int>
}

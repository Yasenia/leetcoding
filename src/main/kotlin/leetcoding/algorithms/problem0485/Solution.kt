package leetcoding.algorithms.problem0485

import leetcoding.core.ISolution

/**
 * [Problem 485](https://leetcode.com/problems/max-consecutive-ones/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = findMaxConsecutiveOnes(input)

    fun findMaxConsecutiveOnes(nums: IntArray): Int
}

package leetcoding.algorithms.problem0421

import leetcoding.core.ISolution

/**
 * [Problem 421](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = findMaximumXOR(input)

    fun findMaximumXOR(nums: IntArray): Int
}

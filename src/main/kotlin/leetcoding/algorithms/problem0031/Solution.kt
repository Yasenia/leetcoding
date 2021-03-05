package leetcoding.algorithms.problem0031

import leetcoding.core.ISolution

/**
 * [Problem 31](https://leetcode.com/problems/next-permutation/)
 * */
interface Solution : ISolution<IntArray, IntArray> {

    override fun solve(input: IntArray): IntArray = input.clone().also { nextPermutation(it) }

    fun nextPermutation(nums: IntArray)
}

package leetcoding.algorithms.problem0456

import leetcoding.core.ISolution

/**
 * [Problem 456](https://leetcode.com/problems/132-pattern/)
 * */
interface Solution : ISolution<IntArray, Boolean> {

    override fun solve(input: IntArray): Boolean = find132pattern(input)

    fun find132pattern(nums: IntArray): Boolean
}

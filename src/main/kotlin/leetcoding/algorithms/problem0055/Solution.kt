package leetcoding.algorithms.problem0055

import leetcoding.core.ISolution

/**
 * [Problem 55](https://leetcode.com/problems/jump-game/)
 * */
interface Solution : ISolution<IntArray, Boolean> {

    override fun solve(input: IntArray): Boolean = canJump(input)

    fun canJump(nums: IntArray): Boolean
}

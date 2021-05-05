package leetcoding.algorithms.problem0740

import leetcoding.core.ISolution

/**
 * https://leetcode.com/problems/delete-and-earn/
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = deleteAndEarn(input)

    fun deleteAndEarn(nums: IntArray): Int
}

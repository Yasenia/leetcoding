package leetcoding.algorithms.problem0377

import leetcoding.core.ISolution

/**
 * [Problem 377](https://leetcode.com/problems/combination-sum-iv/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = combinationSum4(input.first, input.second)

    fun combinationSum4(nums: IntArray, target: Int): Int
}

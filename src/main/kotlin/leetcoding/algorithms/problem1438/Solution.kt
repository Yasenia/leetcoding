package leetcoding.algorithms.problem1438

import leetcoding.core.ISolution

/**
 * [Problem 1438](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = longestSubarray(input.first, input.second)

    fun longestSubarray(nums: IntArray, limit: Int): Int
}

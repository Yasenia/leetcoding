package leetcoding.algorithms.problem0016

import leetcoding.core.ISolution

/**
 * [Problem 16](https://leetcode.com/problems/3sum-closest/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = threeSumClosest(input.first, input.second)

    fun threeSumClosest(nums: IntArray, target: Int): Int
}

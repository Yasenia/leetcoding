package leetcoding.algorithms.problem0081

import leetcoding.core.ISolution

/**
 * [Problem 81](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Boolean> {

    override fun solve(input: Pair<IntArray, Int>): Boolean = search(input.first, input.second)

    fun search(nums: IntArray, target: Int): Boolean
}

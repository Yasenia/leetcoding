package leetcoding.algorithms.problem0220

import leetcoding.core.ISolution

/**
 * [Problem 220](https://leetcode.com/problems/contains-duplicate-iii/)
 * */
interface Solution : ISolution<Triple<IntArray, Int, Int>, Boolean> {

    override fun solve(input: Triple<IntArray, Int, Int>): Boolean = containsNearbyAlmostDuplicate(input.first, input.second, input.third)

    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean
}

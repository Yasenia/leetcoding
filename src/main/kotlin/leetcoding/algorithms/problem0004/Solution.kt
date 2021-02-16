package leetcoding.algorithms.problem0004

import leetcoding.core.ISolution

/**
 * [Problem 4](https://leetcode.com/problems/median-of-two-sorted-arrays/)
 */
interface Solution : ISolution<Pair<IntArray, IntArray>, Double> {

    override fun solve(input: Pair<IntArray, IntArray>): Double = findMedianSortedArrays(input.first, input.second)

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double
}

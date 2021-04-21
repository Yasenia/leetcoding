package leetcoding.algorithms.problem0088

import leetcoding.core.ISolution
import leetcoding.core.lib.Tuple4

/**
 * [Problem 88](https://leetcode.com/problems/merge-sorted-array/)
 * */
interface Solution : ISolution<Tuple4<IntArray, Int, IntArray, Int>, IntArray> {

    override fun solve(input: Tuple4<IntArray, Int, IntArray, Int>): IntArray {
        val nums1 = input.first.copyOf()
        val nums2 = input.third.copyOf()
        merge(nums1, input.second, nums2, input.fourth)
        return nums1
    }

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int)
}

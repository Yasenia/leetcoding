package leetcoding.algorithms.problem0026

import leetcoding.core.ISolution

/**
 * [Problem 26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = removeDuplicates(input.clone())

    fun removeDuplicates(nums: IntArray): Int
}

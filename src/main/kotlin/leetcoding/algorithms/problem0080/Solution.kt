package leetcoding.algorithms.problem0080

import leetcoding.core.ISolution

/**
 * [Problem 80](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = removeDuplicates(input.clone())

    fun removeDuplicates(nums: IntArray): Int
}

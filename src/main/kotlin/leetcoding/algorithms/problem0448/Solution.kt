package leetcoding.algorithms.problem0448

import leetcoding.core.ISolution

/**
 * [Problem 448] (https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
 * */
interface Solution : ISolution<IntArray, List<Int>> {

    override fun solve(input: IntArray): List<Int> = findDisappearedNumbers(input)

    fun findDisappearedNumbers(nums: IntArray): List<Int>
}

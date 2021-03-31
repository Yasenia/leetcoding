package leetcoding.algorithms.problem0090

import leetcoding.core.ISolution

/**
 * [Problem 90](https://leetcode.com/problems/subsets-ii/)
 * */
interface Solution : ISolution<IntArray, Set<Set<Int>>> {

    override fun solve(input: IntArray): Set<Set<Int>> = subsetsWithDup(input).map { it.toSet() }.toSet()

    fun subsetsWithDup(nums: IntArray): List<List<Int>>
}

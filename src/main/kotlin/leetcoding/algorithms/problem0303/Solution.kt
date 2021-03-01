package leetcoding.algorithms.problem0303

import leetcoding.core.ISolution

/**
 * [Problem 303](https://leetcode.com/problems/range-sum-query-immutable/)
 * */
interface Solution : ISolution<Pair<IntArray, List<Pair<Int, Int>>>, List<Int>> {

    override fun solve(input: Pair<IntArray, List<Pair<Int, Int>>>): List<Int> {
        val numArray = buildNumArray(input.first)
        return input.second.map { numArray.sumRange(it.first, it.second) }
    }

    fun buildNumArray(nums: IntArray): NumArray
}

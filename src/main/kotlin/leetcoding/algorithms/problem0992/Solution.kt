package leetcoding.algorithms.problem0992

import leetcoding.core.ISolution

/**
 * [Problem 992](https://leetcode.com/problems/subarrays-with-k-different-integers/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = subarraysWithKDistinct(input.first, input.second)

    fun subarraysWithKDistinct(array: IntArray, k: Int): Int
}

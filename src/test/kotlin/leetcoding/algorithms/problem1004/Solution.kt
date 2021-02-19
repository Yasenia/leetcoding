package leetcoding.algorithms.problem1004

import leetcoding.core.ISolution

/**
 * [Problem 1004](https://leetcode.com/problems/max-consecutive-ones-iii/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = longestOnes(input.first, input.second)

    fun longestOnes(arr: IntArray, k: Int): Int
}

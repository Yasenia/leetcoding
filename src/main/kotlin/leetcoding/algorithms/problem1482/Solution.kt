package leetcoding.algorithms.problem1482

import leetcoding.core.ISolution

/**
 * [Problem 1482](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)
 * */
interface Solution : ISolution<Triple<IntArray, Int, Int>, Int> {

    override fun solve(input: Triple<IntArray, Int, Int>): Int = minDays(input.first, input.second, input.third)

    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int
}

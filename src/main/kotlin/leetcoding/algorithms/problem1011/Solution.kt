package leetcoding.algorithms.problem1011

import leetcoding.core.ISolution

/**
 * [Problem 1011](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = shipWithinDays(input.first, input.second)

    fun shipWithinDays(weights: IntArray, D: Int): Int
}

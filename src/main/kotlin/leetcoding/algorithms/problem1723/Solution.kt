package leetcoding.algorithms.problem1723

import leetcoding.core.ISolution

/**
 * [Problem 1723](https://leetcode.com/problems/find-minimum-time-to-finish-all-jobs/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = minimumTimeRequired(input.first, input.second)

    fun minimumTimeRequired(jobs: IntArray, k: Int): Int
}

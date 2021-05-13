package leetcoding.algorithms.problem1269

import leetcoding.core.ISolution

/**
 * [Problem 1269](https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/)
 * */
interface Solution : ISolution<Pair<Int, Int>, Int> {

    override fun solve(input: Pair<Int, Int>): Int = numWays(input.first, input.second)

    fun numWays(steps: Int, arrLen: Int): Int
}

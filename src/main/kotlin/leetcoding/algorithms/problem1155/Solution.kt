package leetcoding.algorithms.problem1155

import leetcoding.core.ISolution

/**
 * [Problem 1155](https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/)
 * */
interface Solution : ISolution<Triple<Int, Int, Int>, Int> {

    override fun solve(input: Triple<Int, Int, Int>): Int = numRollsToTarget(input.first, input.second, input.third)

    fun numRollsToTarget(d: Int, f: Int, target: Int): Int
}

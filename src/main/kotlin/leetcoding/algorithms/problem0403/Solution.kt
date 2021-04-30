package leetcoding.algorithms.problem0403

import leetcoding.core.ISolution

/**
 * [Problem 403](https://leetcode.com/problems/frog-jump/)
 * */
interface Solution : ISolution<IntArray, Boolean> {

    override fun solve(input: IntArray): Boolean = canCross(input)

    fun canCross(stones: IntArray): Boolean
}

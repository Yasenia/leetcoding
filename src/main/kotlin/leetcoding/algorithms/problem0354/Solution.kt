package leetcoding.algorithms.problem0354

import leetcoding.core.ISolution

/**
 * [Problem 354](https://leetcode.com/problems/russian-doll-envelopes/)
 * */
interface Solution : ISolution<Array<IntArray>, Int> {

    override fun solve(input: Array<IntArray>): Int = maxEnvelopes(input)

    fun maxEnvelopes(envelopes: Array<IntArray>): Int
}

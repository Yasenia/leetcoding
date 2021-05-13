package leetcoding.algorithms.problem1310

import leetcoding.core.ISolution

/**
 * [Problem 1310](https://leetcode.com/problems/xor-queries-of-a-subarray/)
 * */
interface Solution : ISolution<Pair<IntArray, Array<IntArray>>, IntArray> {

    override fun solve(input: Pair<IntArray, Array<IntArray>>): IntArray = xorQueries(input.first, input.second)

    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray
}

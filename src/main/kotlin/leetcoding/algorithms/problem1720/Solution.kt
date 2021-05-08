package leetcoding.algorithms.problem1720

import leetcoding.core.ISolution

/**
 * [Problem 1720](https://leetcode.com/problems/decode-xored-array/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, IntArray> {

    override fun solve(input: Pair<IntArray, Int>): IntArray = decode(input.first, input.second)

    fun decode(encoded: IntArray, first: Int): IntArray
}

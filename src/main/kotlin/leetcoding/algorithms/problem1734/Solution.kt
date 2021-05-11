package leetcoding.algorithms.problem1734

import leetcoding.core.ISolution

/**
 * [Problem 1734](https://leetcode.com/problems/decode-xored-permutation/)
 * */
interface Solution : ISolution<IntArray, IntArray> {

    override fun solve(input: IntArray): IntArray = decode(input)

    fun decode(encoded: IntArray): IntArray
}

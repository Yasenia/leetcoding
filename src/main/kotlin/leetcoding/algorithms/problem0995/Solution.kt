package leetcoding.algorithms.problem0995

import leetcoding.core.ISolution

/**
 * [Problem 995](https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = minKBitFlips(input.first, input.second)

    fun minKBitFlips(arr: IntArray, k: Int): Int
}

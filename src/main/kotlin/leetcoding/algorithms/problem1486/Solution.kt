package leetcoding.algorithms.problem1486

import leetcoding.core.ISolution

/**
 * [Problem 1486](https://leetcode.com/problems/xor-operation-in-an-array/)
 * */
interface Solution : ISolution<Pair<Int, Int>, Int> {

    override fun solve(input: Pair<Int, Int>): Int = xorOperation(input.first, input.second)

    fun xorOperation(n: Int, start: Int): Int
}

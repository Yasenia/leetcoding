package leetcoding.algorithms.problem0190

import leetcoding.core.ISolution

/**
 * [Problem 190](https://leetcode.com/problems/reverse-bits/)
 * */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = reverseBits(input)

    fun reverseBits(n: Int): Int
}

package leetcoding.algorithms.problem0338

import leetcoding.core.ISolution

/**
 * [Problem 338](https://leetcode.com/problems/counting-bits/)
 * */
interface Solution : ISolution<Int, IntArray> {

    override fun solve(input: Int): IntArray = countBits(input)

    fun countBits(num: Int): IntArray
}

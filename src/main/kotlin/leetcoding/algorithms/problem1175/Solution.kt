package leetcoding.algorithms.problem1175

import leetcoding.core.ISolution

/**
 * [Problem 1175](https://leetcode.com/problems/prime-arrangements/)
 * */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = numPrimeArrangements(input)

    fun numPrimeArrangements(n: Int): Int
}

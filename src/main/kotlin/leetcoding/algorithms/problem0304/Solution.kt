package leetcoding.algorithms.problem0304

import leetcoding.core.ISolution
import leetcoding.core.lib.Tuple4

/**
 * [Problem 304](https://leetcode.com/problems/range-sum-query-2d-immutable/)
 * */
interface Solution : ISolution<Pair<Array<IntArray>, List<Tuple4<Int, Int, Int, Int>>>, List<Int>> {

    override fun solve(input: Pair<Array<IntArray>, List<Tuple4<Int, Int, Int, Int>>>): List<Int> {
        val numMatrix = buildNumMatrix(input.first)
        return input.second.map { numMatrix.sumRegion(it.first, it.second, it.third, it.fourth) }
    }

    fun buildNumMatrix(matrix: Array<IntArray>): NumMatrix
}

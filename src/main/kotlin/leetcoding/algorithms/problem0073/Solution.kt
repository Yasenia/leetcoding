package leetcoding.algorithms.problem0073

import leetcoding.core.ISolution

/**
 * [Problem 73](https://leetcode.com/problems/set-matrix-zeroes/)
 * */
interface Solution : ISolution<Array<IntArray>, Array<IntArray>> {

    override fun solve(input: Array<IntArray>): Array<IntArray> = input.map { it.clone() }.toTypedArray().also { setZeroes(it) }

    fun setZeroes(matrix: Array<IntArray>)
}

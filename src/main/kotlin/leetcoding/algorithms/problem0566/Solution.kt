package leetcoding.algorithms.problem0566

import leetcoding.core.ISolution

/**
 * [Problem 566](https://leetcode.com/problems/reshape-the-matrix/)
 * */
interface Solution : ISolution<Triple<Array<IntArray>, Int, Int>, Array<IntArray>> {

    override fun solve(input: Triple<Array<IntArray>, Int, Int>): Array<IntArray> = matrixReshape(input.first, input.second, input.third)

    fun matrixReshape(nums: Array<IntArray>, r: Int, c: Int): Array<IntArray>
}

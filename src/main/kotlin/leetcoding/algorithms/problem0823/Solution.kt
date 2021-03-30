package leetcoding.algorithms.problem0823

import leetcoding.core.ISolution

/**
 * [Problem 823](https://leetcode.com/problems/binary-trees-with-factors/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = numFactoredBinaryTrees(input)

    fun numFactoredBinaryTrees(arr: IntArray): Int
}

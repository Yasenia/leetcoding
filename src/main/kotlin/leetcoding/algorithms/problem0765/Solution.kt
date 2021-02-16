package leetcoding.algorithms.problem0765

import leetcoding.core.ISolution

interface Solution : ISolution<IntArray, Int> {
    override fun solve(input: IntArray): Int = minSwapsCouples(input)

    fun minSwapsCouples(row: IntArray): Int
}

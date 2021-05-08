package leetcoding.algorithms.problem1720

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, IntArray>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, IntArray>> = listOf(
        Pair(intArrayOf(1, 2, 3), 1) to intArrayOf(1, 0, 2, 1),
        Pair(intArrayOf(6, 2, 7, 3), 4) to intArrayOf(4, 2, 0, 7, 4)
    )
}

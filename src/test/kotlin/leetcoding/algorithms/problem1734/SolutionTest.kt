package leetcoding.algorithms.problem1734

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, IntArray>() {

    override val solutions: List<ISolution<IntArray, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, IntArray>> = listOf(
        intArrayOf(3, 1) to intArrayOf(1, 2, 3),
        intArrayOf(6, 5, 4, 6) to intArrayOf(2, 4, 1, 5, 3),
    )
}

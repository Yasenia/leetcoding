package leetcoding.algorithms.problem0031

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, IntArray>() {

    override val solutions: List<ISolution<IntArray, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, IntArray>> = listOf(
        intArrayOf(1, 3, 2) to intArrayOf(2, 1, 3),
        intArrayOf(1, 2, 3) to intArrayOf(1, 3, 2),
        intArrayOf(3, 2, 1) to intArrayOf(1, 2, 3),
        intArrayOf(1, 1, 5) to intArrayOf(1, 5, 1),
        intArrayOf(1, 2, 3, 4, 9, 8, 7, 5, 6) to intArrayOf(1, 2, 3, 4, 9, 8, 7, 6, 5),
        intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1) to intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
        intArrayOf(1) to intArrayOf(1),
    )
}

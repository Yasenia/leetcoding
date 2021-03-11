package leetcoding.algorithms.problem0904

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf() to 0,
        intArrayOf(1, 2, 1) to 3,
        intArrayOf(0, 1, 2, 2) to 3,
        intArrayOf(1, 2, 3, 2, 2) to 4,
        intArrayOf(1, 0, 1, 4, 1, 4, 1, 2, 3) to 5,
        intArrayOf(3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4) to 5,
        intArrayOf(1, 0, 29, 29, 29, 29, 29, 29, 0, 0, 29, 8, 8, 29, 8, 29, 8, 8, 15, 8, 8, 15, 15, 8, 15, 15, 8, 8, 7, 5) to 12,
    )
}

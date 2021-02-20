package leetcoding.algorithms.problem0697

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 2, 2, 3, 1) to 2,
        intArrayOf(1, 2, 2, 3, 1, 4, 2) to 6,
        intArrayOf(2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2) to 7,
    )
}

package leetcoding.algorithms.problem0213

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(2, 3, 2) to 3,
        intArrayOf(1, 2, 3, 1) to 4,
        intArrayOf(0) to 0,
        intArrayOf(4, 1, 2, 7, 5, 3, 1) to 14,
    )
}

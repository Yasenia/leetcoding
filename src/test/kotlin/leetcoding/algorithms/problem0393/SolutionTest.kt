package leetcoding.algorithms.problem0393

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Boolean>() {

    override val solutions: List<ISolution<IntArray, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Boolean>> = listOf(
        intArrayOf(197, 130, 1) to true,
        intArrayOf(235, 140, 4) to false,
    )
}

package leetcoding.algorithms.problem0665

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Boolean>() {

    override val solutions: List<ISolution<IntArray, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Boolean>> = listOf(
        intArrayOf(4, 2, 3) to true,
        intArrayOf(4, 2, 1) to false,
        intArrayOf(5, 7, 1, 8) to true,
        intArrayOf(1, 4, 1, 2) to true
    )
}

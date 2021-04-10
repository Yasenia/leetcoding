package leetcoding.algorithms.problem0154

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 3, 5) to 1,
        intArrayOf(2, 2, 2, 0, 1) to 0,
        intArrayOf(2, 0, 1, 1, 1) to 0,
    )
}

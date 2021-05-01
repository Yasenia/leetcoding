package leetcoding.algorithms.problem0137

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(2, 2, 3, 2) to 3,
        intArrayOf(0, 1, 0, 1, 0, 1, 99) to 99,
    )
}

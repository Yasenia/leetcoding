package leetcoding.algorithms.problem0765

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(0, 2, 1, 3) to 1,
        intArrayOf(3, 2, 0, 1) to 0,
        intArrayOf(5, 4, 2, 6, 3, 1, 0, 7) to 2,
    )
}

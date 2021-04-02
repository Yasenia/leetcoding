package leetcoding.algorithms.interview1721

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1) to 6,
        intArrayOf(2, 0, 2) to 2,
    )
}

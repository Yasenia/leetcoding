package leetcoding.algorithms.problem0011

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7) to 49,
        intArrayOf(4, 3, 2, 1, 4) to 16,
        intArrayOf(1, 2, 1) to 2,
    )
}

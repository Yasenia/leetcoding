package leetcoding.algorithms.problem0448

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, List<Int>>() {

    override val solutions: List<ISolution<IntArray, List<Int>>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<IntArray, List<Int>>> = listOf(
        intArrayOf(4, 3, 2, 7, 8, 2, 3, 1) to listOf(5, 6)
    )
}

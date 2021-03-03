package leetcoding.algorithms.problem0338

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, IntArray>() {

    override val solutions: List<ISolution<Int, IntArray>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Int, IntArray>> = listOf(
        2 to intArrayOf(0, 1, 1),
        4 to intArrayOf(0, 1, 1, 2, 1),
        5 to intArrayOf(0, 1, 1, 2, 1, 2),
    )
}

package leetcoding.algorithms.problem0492

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, IntArray>() {

    override val solutions: List<ISolution<Int, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<Int, IntArray>> = listOf(
        4 to intArrayOf(2, 2),
    )
}

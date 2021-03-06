package leetcoding.algorithms.problem0503

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, IntArray>() {

    override val solutions: List<ISolution<IntArray, IntArray>> = listOf(Solution2())

    override val testCases: List<Pair<IntArray, IntArray>> = listOf(
        intArrayOf(1, 2, 1) to intArrayOf(2, -1, 2),
    )
}

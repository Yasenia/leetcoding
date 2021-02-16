package leetcoding.algorithms.problem0485

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 1, 0, 1, 1, 1) to 3
    )
}

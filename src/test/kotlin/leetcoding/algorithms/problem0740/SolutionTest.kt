package leetcoding.algorithms.problem0740

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(3, 4, 2) to 6,
        intArrayOf(2, 2, 3, 3, 3, 4) to 9,
    )
}

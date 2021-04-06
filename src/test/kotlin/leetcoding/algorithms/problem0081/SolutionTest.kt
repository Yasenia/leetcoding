package leetcoding.algorithms.problem0081

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Boolean>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Boolean>> = listOf(
        Pair(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0) to true,
        Pair(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3) to false,
    )
}

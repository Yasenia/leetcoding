package leetcoding.algorithms.problem0523

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Boolean>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Boolean>> = listOf(
        Pair(intArrayOf(0, 0), 0) to true,
        Pair(intArrayOf(0), 0) to false,
        Pair(intArrayOf(23, 2, 2, 6, 7), 6) to false,
        Pair(intArrayOf(23, 2, 4, 6, 7), 6) to true,
        Pair(intArrayOf(23, 2, 6, 4, 7), 6) to true,
        Pair(intArrayOf(23, 2, 6, 4, 7), 0) to false,
    )
}

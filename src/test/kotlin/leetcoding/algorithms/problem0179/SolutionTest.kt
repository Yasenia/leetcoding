package leetcoding.algorithms.problem0179

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, String>() {

    override val solutions: List<ISolution<IntArray, String>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, String>> = listOf(
        intArrayOf(10, 2) to "210",
        intArrayOf(3, 30, 34, 5, 9) to "9534330",
        intArrayOf(1) to "1",
        intArrayOf(10) to "10",
        intArrayOf(0, 0) to "0",
    )
}

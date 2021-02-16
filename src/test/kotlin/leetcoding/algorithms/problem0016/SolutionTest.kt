package leetcoding.algorithms.problem0016

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(-1, 2, 1, -4), 1) to 2,
        Pair(intArrayOf(-3, -2, -5, 3, -4), -1) to -2,
    )
}

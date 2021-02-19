package leetcoding.algorithms.problem1004

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2) to 6,
        Pair(intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1), 3) to 10,
    )
}

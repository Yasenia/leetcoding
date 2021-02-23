package leetcoding.algorithms.problem1052

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Triple<IntArray, IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Triple<IntArray, IntArray, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<IntArray, IntArray, Int>, Int>> = listOf(
        Triple(intArrayOf(1, 0, 1, 2, 1, 1, 7, 5), intArrayOf(0, 1, 0, 1, 0, 1, 0, 1), 3) to 16
    )
}

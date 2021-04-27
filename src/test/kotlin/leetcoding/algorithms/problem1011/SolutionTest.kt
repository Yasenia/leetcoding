package leetcoding.algorithms.problem1011

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5) to 15,
        Pair(intArrayOf(3, 2, 2, 4, 1, 4), 3) to 6,
        Pair(intArrayOf(1, 2, 3, 1, 1), 4) to 3,
    )
}

package leetcoding.algorithms.problem0421

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(3, 10, 5, 25, 2, 8) to 28,
        intArrayOf(0) to 0,
        intArrayOf(2, 4) to 6,
        intArrayOf(8, 10, 2) to 10,
        intArrayOf(14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70) to 127,
    )
}

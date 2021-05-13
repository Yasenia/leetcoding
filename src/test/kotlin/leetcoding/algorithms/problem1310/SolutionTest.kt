package leetcoding.algorithms.problem1310

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Array<IntArray>>, IntArray>() {

    override val solutions: List<ISolution<Pair<IntArray, Array<IntArray>>, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Array<IntArray>>, IntArray>> = listOf(
        Pair(
            intArrayOf(1, 3, 4, 8),
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(0, 3),
                intArrayOf(3, 3),
            )
        ) to intArrayOf(2, 7, 14, 8),
        Pair(
            intArrayOf(4, 8, 2, 10),
            arrayOf(
                intArrayOf(2, 3),
                intArrayOf(1, 3),
                intArrayOf(0, 0),
                intArrayOf(0, 3),
            )
        ) to intArrayOf(8, 0, 4, 4),
    )
}

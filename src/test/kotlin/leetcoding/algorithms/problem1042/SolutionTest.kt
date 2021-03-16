package leetcoding.algorithms.problem1042

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Array<IntArray>>, IntArray>() {

    override val solutions: List<ISolution<Pair<Int, Array<IntArray>>, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Int, Array<IntArray>>, IntArray>> = listOf(
        Pair(
            3,
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 1),
            )
        ) to intArrayOf(1, 2, 3),
        Pair(
            4,
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 4),
            )
        ) to intArrayOf(1, 2, 1, 2),
        Pair(
            4,
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 1),
                intArrayOf(1, 3),
                intArrayOf(2, 4),
            )
        ) to intArrayOf(1, 2, 3, 4),
    )
}

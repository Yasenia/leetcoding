package leetcoding.algorithms.problem0867

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, Array<IntArray>>() {

    override val solutions: List<ISolution<Array<IntArray>, Array<IntArray>>> = listOf(Solution1())

    override val testCases: List<Pair<Array<IntArray>, Array<IntArray>>> = listOf(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        ) to arrayOf(
            intArrayOf(1, 4, 7),
            intArrayOf(2, 5, 8),
            intArrayOf(3, 6, 9),
        ),
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
        ) to arrayOf(
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(3, 6),
        ),
    )
}

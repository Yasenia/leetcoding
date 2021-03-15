package leetcoding.algorithms.problem0054

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, List<Int>>() {

    override val solutions: List<ISolution<Array<IntArray>, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<Array<IntArray>, List<Int>>> = listOf(
        arrayOf(
            intArrayOf(7),
            intArrayOf(9),
            intArrayOf(6),
        ) to listOf(7, 9, 6),
        arrayOf(
            intArrayOf(3),
            intArrayOf(2),
        ) to listOf(3, 2),
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        ) to listOf(1, 2, 3, 6, 9, 8, 7, 4, 5),
        arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
        ) to listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
        arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16),
        ) to listOf(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10),
    )
}

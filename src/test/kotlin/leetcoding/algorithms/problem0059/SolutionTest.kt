package leetcoding.algorithms.problem0059

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Array<IntArray>>() {

    override val solutions: List<ISolution<Int, Array<IntArray>>> = listOf(Solution1())

    override val testCases: List<Pair<Int, Array<IntArray>>> = listOf(
        0 to emptyArray(),
        1 to arrayOf(
            intArrayOf(1),
        ),
        2 to arrayOf(
            intArrayOf(1, 2),
            intArrayOf(4, 3),
        ),
        3 to arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(8, 9, 4),
            intArrayOf(7, 6, 5),
        ),
        4 to arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(12, 13, 14, 5),
            intArrayOf(11, 16, 15, 6),
            intArrayOf(10, 9, 8, 7),
        ),
    )
}

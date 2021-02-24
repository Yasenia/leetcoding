package leetcoding.algorithms.problem0832

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, Array<IntArray>>() {

    override val solutions: List<ISolution<Array<IntArray>, Array<IntArray>>> = listOf(Solution1())

    override val testCases: List<Pair<Array<IntArray>, Array<IntArray>>> = listOf(
        arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
        ) to arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1),
        ),
        arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(1, 0, 0, 1),
            intArrayOf(0, 1, 1, 1),
            intArrayOf(1, 0, 1, 0),
        ) to arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 1),
            intArrayOf(1, 0, 1, 0),
        ),
    )
}

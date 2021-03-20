package leetcoding.algorithms.problem0073

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, Array<IntArray>>() {

    override val solutions: List<ISolution<Array<IntArray>, Array<IntArray>>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Array<IntArray>, Array<IntArray>>> = listOf(
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        ) to arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
        ),
        arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5),
        ) to arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 4, 5, 0),
            intArrayOf(0, 3, 1, 0),
        ),
    )
}

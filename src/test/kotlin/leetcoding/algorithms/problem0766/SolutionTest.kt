package leetcoding.algorithms.problem0766

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, Boolean>() {

    override val solutions: List<ISolution<Array<IntArray>, Boolean>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Array<IntArray>, Boolean>> = listOf(
        arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 1, 2, 3),
            intArrayOf(9, 5, 1, 2),
        ) to true,
        arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 1, 2, 3),
            intArrayOf(9, 5, 1, 2),
            intArrayOf(8, 9, 5, 1),
            intArrayOf(1, 8, 9, 5),
        ) to true,
        arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 2),
        ) to false,
    )
}

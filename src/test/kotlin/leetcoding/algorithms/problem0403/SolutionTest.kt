package leetcoding.algorithms.problem0403

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Boolean>() {

    override val solutions: List<ISolution<IntArray, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Boolean>> = listOf(
        intArrayOf(0, 1, 3, 5, 6, 8, 12, 17) to true,
        intArrayOf(0, 1, 2, 3, 4, 8, 9, 11) to false,
        intArrayOf(0, 2) to false,
        ((0 until 999).toList() + 99999999).toIntArray() to false
    )
}

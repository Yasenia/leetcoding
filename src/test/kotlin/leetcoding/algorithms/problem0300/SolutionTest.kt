package leetcoding.algorithms.problem0300

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(10, 9, 2, 5, 3, 7, 101, 18) to 4,
        intArrayOf(0, 1, 0, 3, 2, 3) to 4,
        intArrayOf(7, 7, 7, 7, 7, 7, 7) to 1,
    )
}

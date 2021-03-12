package leetcoding.algorithms.problem0055

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Boolean>() {

    override val solutions: List<ISolution<IntArray, Boolean>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Boolean>> = listOf(
        intArrayOf(2, 3, 1, 1, 4) to true,
        intArrayOf(3, 2, 1, 0, 4) to false,
        intArrayOf(2, 5, 0, 0) to true,
    )
}

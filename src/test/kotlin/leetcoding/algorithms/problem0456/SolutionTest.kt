package leetcoding.algorithms.problem0456

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Boolean>() {

    override val solutions: List<ISolution<IntArray, Boolean>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Boolean>> = listOf(
        intArrayOf(1, 2, 3, 4) to false,
        intArrayOf(3, 1, 4, 2) to true,
        intArrayOf(-1, 3, 2, 0) to true,
        intArrayOf(3, 5, 0, 3, 4) to true,
    )
}

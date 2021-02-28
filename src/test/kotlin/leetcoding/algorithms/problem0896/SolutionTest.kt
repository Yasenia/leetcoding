package leetcoding.algorithms.problem0896

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Boolean>() {

    override val solutions: List<ISolution<IntArray, Boolean>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<IntArray, Boolean>> = listOf(
        intArrayOf(1, 2, 2, 3) to true,
        intArrayOf(6, 5, 4, 4) to true,
        intArrayOf(1, 3, 2) to false,
        intArrayOf(1, 2, 4, 5) to true,
        intArrayOf(1, 1, 1) to true,
    )
}

package leetcoding.algorithms.problem0009

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Boolean>() {

    override val solutions: List<ISolution<Int, Boolean>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Int, Boolean>> = listOf(
        0 to true, 121 to true, 1234321 to true, 1000110001 to true,
        -5 to false, -121 to false, -1234321 to false, 100011001 to false, Int.MAX_VALUE to false, Int.MIN_VALUE to false
    )
}

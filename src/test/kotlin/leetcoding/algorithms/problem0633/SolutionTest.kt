package leetcoding.algorithms.problem0633

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Boolean>() {

    override val solutions: List<ISolution<Int, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Int, Boolean>> = listOf(
        5 to true,
        3 to false,
        4 to true,
        2 to true,
        1 to true,
    )
}

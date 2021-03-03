package leetcoding.algorithms.problem0386

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, List<Int>>() {

    override val solutions: List<ISolution<Int, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<Int, List<Int>>> = listOf(
        13 to listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9),
    )
}

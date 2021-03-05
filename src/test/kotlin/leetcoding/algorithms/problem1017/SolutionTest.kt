package leetcoding.algorithms.problem1017

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, String>() {

    override val solutions: List<ISolution<Int, String>> = listOf(Solution1())

    override val testCases: List<Pair<Int, String>> = listOf(
        2 to "110",
        3 to "111",
        4 to "100",
        6 to "11010",
    )
}

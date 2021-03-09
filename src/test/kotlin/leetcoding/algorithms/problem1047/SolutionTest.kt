package leetcoding.algorithms.problem1047

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, String>() {

    override val solutions: List<ISolution<String, String>> = listOf(Solution1())

    override val testCases: List<Pair<String, String>> = listOf(
        "abbaca" to "ca",
    )
}

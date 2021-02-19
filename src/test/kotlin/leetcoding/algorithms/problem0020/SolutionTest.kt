package leetcoding.algorithms.problem0020

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Boolean>() {

    override val solutions: List<ISolution<String, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<String, Boolean>> = listOf(
        "()" to true,
        "()[]{}" to true,
        "(]" to false,
        "([)]" to false,
        "{[]}" to true,
        "[" to false,
    )
}

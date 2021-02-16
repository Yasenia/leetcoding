package leetcoding.algorithms.problem0017

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, List<String>>() {

    override val solutions: List<ISolution<String, List<String>>> = listOf(Solution1())

    override val testCases: List<Pair<String, List<String>>> = listOf(
        "123" to listOf("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf"),
        "" to listOf(),
        "2" to listOf("a", "b", "c")
    )
}

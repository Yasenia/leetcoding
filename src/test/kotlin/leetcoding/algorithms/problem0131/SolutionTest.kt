package leetcoding.algorithms.problem0131

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Set<List<String>>>() {

    override val solutions: List<ISolution<String, Set<List<String>>>> = listOf(Solution1())

    override val testCases: List<Pair<String, Set<List<String>>>> = listOf(
        "aab" to setOf(
            listOf("aa", "b"),
            listOf("a", "a", "b"),
        )
    )
}

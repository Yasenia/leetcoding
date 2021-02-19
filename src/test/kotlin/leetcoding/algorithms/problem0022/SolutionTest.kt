package leetcoding.algorithms.problem0022

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Set<String>>() {

    override val solutions: List<ISolution<Int, Set<String>>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Int, Set<String>>> = listOf(
        3 to setOf("((()))", "(()())", "(())()", "()(())", "()()()"),
        1 to setOf("()"),
    )
}

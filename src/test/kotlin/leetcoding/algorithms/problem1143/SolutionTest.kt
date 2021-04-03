package leetcoding.algorithms.problem1143

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Int>() {

    override val solutions: List<ISolution<Pair<String, String>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<String, String>, Int>> = listOf(
        Pair("abcde", "ace") to 3,
        Pair("abc", "abc") to 3,
        Pair("abc", "def") to 0,
    )
}

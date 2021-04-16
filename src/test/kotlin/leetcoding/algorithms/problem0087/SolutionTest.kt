package leetcoding.algorithms.problem0087

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Boolean>() {

    override val solutions: List<ISolution<Pair<String, String>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<String, String>, Boolean>> = listOf(
        Pair("great", "rgeat") to true,
        Pair("abcde", "caebd") to false,
        Pair("a", "a") to true,
        Pair("eebaacbcbcadaaedceaaacadccd", "eadcaacabaddaceacbceaabeccd") to false,
    )
}

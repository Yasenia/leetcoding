package leetcoding.algorithms.problem0076

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, String>() {

    override val solutions: List<ISolution<Pair<String, String>, String>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<String, String>, String>> = listOf(
        Pair("aaaaaaaaaaaabbbbbcdd", "abcdd") to "abbbbbcdd",
        Pair("a", "aa") to "",
        Pair("ADOBECODEBANC", "ABC") to "BANC",
        Pair("a", "a") to "a",
    )
}

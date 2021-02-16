package leetcoding.algorithms.problem0010

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Boolean>() {

    override val solutions: List<ISolution<Pair<String, String>, Boolean>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<String, String>, Boolean>> = listOf(
        Pair("a", ".*..a") to false,
        Pair("a", ".*..a") to false,
        Pair("aaa", "a*a") to true,
        Pair("ab", ".*") to true,
        Pair("aa", "a") to false,
        Pair("aa", "a.") to true,
        Pair("aa", "a*") to true,
        Pair("aab", "c*a*b") to true,
        Pair("mississippi", "mis*is*p*.") to false,
    )
}

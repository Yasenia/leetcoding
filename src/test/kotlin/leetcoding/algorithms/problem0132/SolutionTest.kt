package leetcoding.algorithms.problem0132

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<String, Int>> = listOf(
        "ababababababababababababcbabababababababababababa" to 0,
        "aaabaa" to 1,
        "aab" to 1,
        "a" to 0,
        "ab" to 1,
    )
}

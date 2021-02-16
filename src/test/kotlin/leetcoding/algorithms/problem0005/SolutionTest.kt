package leetcoding.algorithms.problem0005

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, String>() {

    override val solutions: List<ISolution<String, String>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<String, String>> = listOf(
        "babad" to "bab",
        "cbbd" to "bb"
    )
}

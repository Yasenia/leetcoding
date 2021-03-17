package leetcoding.algorithms.problem0115

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Int>() {

    override val solutions: List<ISolution<Pair<String, String>, Int>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Pair<String, String>, Int>> = listOf(
        Pair("rabbbit", "rabbit") to 3,
        Pair("babgbag", "bag") to 5,
    )
}

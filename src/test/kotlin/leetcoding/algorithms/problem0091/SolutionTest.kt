package leetcoding.algorithms.problem0091

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1())

    override val testCases: List<Pair<String, Int>> = listOf(
        "12" to 2,
        "226" to 3,
        "0" to 0,
        "06" to 0,
    )
}

package leetcoding.algorithms.problem0032

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<String, Int>> = listOf(
        "()" to 2,
        "(()" to 2,
        ")()())" to 4,
        "" to 0,
    )
}

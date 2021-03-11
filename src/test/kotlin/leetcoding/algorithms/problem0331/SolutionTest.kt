package leetcoding.algorithms.problem0331

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Boolean>() {

    override val solutions: List<ISolution<String, Boolean>> = listOf(Solution2())

    override val testCases: List<Pair<String, Boolean>> = listOf(
        "9,3,4,#,#,1,#,#,2,#,6,#,#" to true,
        "1,#" to false,
        "9,#,#,1" to false
    )
}

package leetcoding.algorithms.problem0387

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<String, Int>> = listOf(
        "leetcode" to 0,
        "loveleetcode" to 2,
    )
}

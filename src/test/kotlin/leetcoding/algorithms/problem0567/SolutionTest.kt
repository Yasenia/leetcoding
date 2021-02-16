package leetcoding.algorithms.problem0567

import leetcoding.core.ISolutionTest

class SolutionTest : ISolutionTest<Pair<String, String>, Boolean>() {

    override val solutions = listOf(Solution1(), Solution2())

    override val testCases = listOf(
        Pair("ab", "eidboaoo") to false,
        Pair("ab", "eidbaooo") to true,
    )
}

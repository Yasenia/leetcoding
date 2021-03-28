package leetcoding.algorithms.problem0583

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Int>() {

    override val solutions: List<ISolution<Pair<String, String>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<String, String>, Int>> = listOf(
        Pair("sea", "eat") to 2,
        Pair("leetcode", "etco") to 4,
    )
}

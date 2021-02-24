package leetcoding.algorithms.problem0028

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Int>() {

    override val solutions: List<ISolution<Pair<String, String>, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<String, String>, Int>> = listOf(
        Pair("abdscsavaqrqb", "babab") to -1,
        Pair("mississippi", "issip") to 4,
        Pair("mississippi", "issipi") to -1,
        Pair("hello", "ll") to 2,
        Pair("aaaaa", "bba") to -1,
        Pair("hello", "") to 0,
    )
}

package leetcoding.algorithms.problem0395

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, Int>, Int>() {

    override val solutions: List<ISolution<Pair<String, Int>, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<String, Int>, Int>> = listOf(
        Pair("aaabb", 3) to 3,
        Pair("ababbc", 2) to 5,
    )
}

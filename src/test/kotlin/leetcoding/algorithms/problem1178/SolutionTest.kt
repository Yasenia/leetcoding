package leetcoding.algorithms.problem1178

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Array<String>, Array<String>>, List<Int>>() {

    override val solutions: List<ISolution<Pair<Array<String>, Array<String>>, List<Int>>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Pair<Array<String>, Array<String>>, List<Int>>> = listOf(
        Pair(
            arrayOf("aaaa", "asas", "able", "ability", "actt", "actor", "access"),
            arrayOf("aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz")
        ) to listOf(1, 1, 3, 2, 4, 0)
    )
}

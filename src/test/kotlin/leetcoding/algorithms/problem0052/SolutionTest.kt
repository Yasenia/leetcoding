package leetcoding.algorithms.problem0052

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Int, Int>> = listOf(
        1 to 1,
        2 to 0,
        3 to 0,
        4 to 2,
        5 to 10,
        6 to 4,
        7 to 40,
        8 to 92,
        9 to 352,
    )
}

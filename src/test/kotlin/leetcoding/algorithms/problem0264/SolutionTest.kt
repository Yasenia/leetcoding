package leetcoding.algorithms.problem0264

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Int, Int>> = listOf(
        1 to 1,
        2 to 2,
        3 to 3,
        4 to 4,
        5 to 5,
        6 to 6,
        7 to 8,
        8 to 9,
        9 to 10,
        10 to 12,
        11 to 15,
        12 to 16,
        13 to 18,
        14 to 20,
    )
}

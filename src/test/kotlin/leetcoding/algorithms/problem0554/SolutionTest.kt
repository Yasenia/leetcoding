package leetcoding.algorithms.problem0554

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<List<List<Int>>, Int>() {

    override val solutions: List<ISolution<List<List<Int>>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<List<List<Int>>, Int>> = listOf(
        listOf(
            listOf(1, 2, 2, 1),
            listOf(3, 1, 2),
            listOf(1, 3, 2),
            listOf(2, 4),
            listOf(3, 1, 2),
            listOf(1, 3, 1, 1),
        ) to 2,
        listOf(
            listOf(1),
            listOf(1),
            listOf(1),
        ) to 3,
    )
}

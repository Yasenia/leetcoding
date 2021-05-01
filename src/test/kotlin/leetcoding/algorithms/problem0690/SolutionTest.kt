package leetcoding.algorithms.problem0690

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<List<Employee?>, Int>, Int>() {

    override val solutions: List<ISolution<Pair<List<Employee?>, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<List<Employee?>, Int>, Int>> = listOf(
        Pair(
            listOf(
                Employee(1, 5, listOf(2, 3)),
                Employee(2, 3, listOf()),
                Employee(3, 3, listOf()),
            ),
            1
        ) to 11,
    )
}

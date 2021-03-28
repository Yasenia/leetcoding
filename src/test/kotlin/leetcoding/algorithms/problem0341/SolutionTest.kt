package leetcoding.algorithms.problem0341

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.NestedInteger
import leetcoding.core.datastructure.nestedIntOf

internal class SolutionTest : ISolutionTest<List<NestedInteger>, List<Int>>() {

    override val solutions: List<ISolution<List<NestedInteger>, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<List<NestedInteger>, List<Int>>> = listOf(
        listOf(
            nestedIntOf(1),
            nestedIntOf(
                nestedIntOf(4),
                nestedIntOf(
                    nestedIntOf(6)
                )
            ),
        ) to listOf(1, 4, 6),
        listOf(
            nestedIntOf(
                nestedIntOf(1),
                nestedIntOf(1)
            ),
            nestedIntOf(2),
            nestedIntOf(
                nestedIntOf(1),
                nestedIntOf(1),
            ),
        ) to listOf(1, 1, 2, 1, 1),
        listOf(nestedIntOf()) to listOf(),
    )
}

package leetcoding.algorithms.problem0706

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<List<(MyHashMap) -> Any>, List<Any>>() {

    override val solutions: List<ISolution<List<(MyHashMap) -> Any>, List<Any>>> = listOf(Solution1())

    override val testCases: List<Pair<List<(MyHashMap) -> Any>, List<Any>>> = listOf(
        listOf<(MyHashMap) -> Any>(
            { it.put(1, 1) },
            { it.put(2, 2) },
            { it.get(1) },
            { it.get(3) },
            { it.put(2, 1) },
            { it.get(2) },
            { it.remove(2) },
            { it.get(2) },
        ) to listOf(Unit, Unit, 1, -1, Unit, 1, Unit, -1)
    )
}

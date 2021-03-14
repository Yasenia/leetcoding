package leetcoding.algorithms.problem0705

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<List<(MyHashSet) -> Any>, List<Any>>() {

    override val solutions: List<ISolution<List<(MyHashSet) -> Any>, List<Any>>> = listOf(Solution1())

    override val testCases: List<Pair<List<(MyHashSet) -> Any>, List<Any>>> = listOf(
        listOf<(MyHashSet) -> Any>(
            { it.add(1) },
            { it.add(3) },
            { it.add(7) },
            { it.add(15) },
            { it.contains(1) },
            { it.remove(3) },
            { it.contains(3) },
            { it.contains(7) },
            { it.contains(15) },
        ) to listOf(Unit, Unit, Unit, Unit, true, Unit, false, true, true),
        listOf<(MyHashSet) -> Any>(
            { it.add(1) },
            { it.contains(1) },
            { it.add(2) },
            { it.contains(2) },
            { it.remove(1) },
            { it.contains(1) },
        ) to listOf(Unit, true, Unit, true, Unit, false),
        listOf<(MyHashSet) -> Any>(
            { it.add(1) },
            { it.add(2) },
            { it.contains(1) },
            { it.contains(3) },
            { it.add(2) },
            { it.contains(2) },
            { it.remove(2) },
            { it.contains(2) },
        ) to listOf(Unit, Unit, true, false, Unit, true, Unit, false),
        listOf<(MyHashSet) -> Any>(
            { it.add(9) },
            { it.remove(19) },
            { it.add(14) },
            { it.remove(19) },
            { it.remove(9) },
            { it.add(0) },
            { it.add(3) },
            { it.add(4) },
            { it.add(0) },
            { it.remove(9) },
        ) to listOf(Unit, Unit, Unit, Unit, Unit, Unit, Unit, Unit, Unit, Unit),
        listOf<(MyHashSet) -> Any>(
            { it.contains(72) },
            { it.add(72) },
            { it.add(73) },
            { it.add(74) },
            { it.add(75) },
            { it.contains(72) },
            { it.remove(72) },
            { it.remove(72) },
            { it.contains(72) },
            { it.add(72) },
            { it.add(72) },
            { it.contains(72) },
        ) to listOf(false, Unit, Unit, Unit, Unit, true, Unit, Unit, false, Unit, Unit, true),
    )
}

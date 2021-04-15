package leetcoding.algorithms.problem0208

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<List<(Trie) -> Any>, List<Any>>() {

    override val solutions: List<ISolution<List<(Trie) -> Any>, List<Any>>> = listOf(Solution1())

    override val testCases: List<Pair<List<(Trie) -> Any>, List<Any>>> = listOf(
        listOf<(Trie) -> Any>(
            { it.insert("apple") },
            { it.search("apple") },
            { it.search("app") },
            { it.startsWith("app") },
            { it.insert("app") },
            { it.search("app") },
        ) to listOf(Unit, true, false, true, Unit, true)
    )
}

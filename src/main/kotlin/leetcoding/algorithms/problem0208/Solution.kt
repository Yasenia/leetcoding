package leetcoding.algorithms.problem0208

import leetcoding.core.ISolution

/**
 * [Problem 208](https://leetcode.com/problems/implement-trie-prefix-tree/)
 * */
interface Solution : ISolution<List<(Trie) -> Any>, List<Any>> {

    override fun solve(input: List<(Trie) -> Any>): List<Any> {
        val trie = buildTrie()
        return input.map { it.invoke(trie) }
    }

    fun buildTrie(): Trie
}

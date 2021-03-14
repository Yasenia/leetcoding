package leetcoding.algorithms.problem0705

import leetcoding.core.ISolution

interface Solution : ISolution<List<(MyHashSet) -> Any>, List<Any>> {

    override fun solve(input: List<(MyHashSet) -> Any>): List<Any> {
        val myHashSet = buildMyHashSet()
        return input.map { it.invoke(myHashSet) }
    }

    fun buildMyHashSet(): MyHashSet
}

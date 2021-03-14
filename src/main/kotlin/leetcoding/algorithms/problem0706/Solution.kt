package leetcoding.algorithms.problem0706

import leetcoding.core.ISolution

interface Solution : ISolution<List<(MyHashMap) -> Any>, List<Any>> {

    override fun solve(input: List<(MyHashMap) -> Any>): List<Any> {
        val myHashMap = buildMyHashMap()
        return input.map { it.invoke(myHashMap) }
    }

    fun buildMyHashMap(): MyHashMap
}

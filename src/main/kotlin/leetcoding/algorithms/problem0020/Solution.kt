package leetcoding.algorithms.problem0020

import leetcoding.core.ISolution

interface Solution : ISolution<String, Boolean> {

    override fun solve(input: String): Boolean = isValid(input)

    fun isValid(s: String): Boolean
}

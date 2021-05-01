package leetcoding.algorithms.problem0690

import leetcoding.core.ISolution

/**
 * [Problem 690](https://leetcode.com/problems/employee-importance/)
 * */
interface Solution : ISolution<Pair<List<Employee?>, Int>, Int> {

    override fun solve(input: Pair<List<Employee?>, Int>): Int = getImportance(input.first, input.second)

    fun getImportance(employees: List<Employee?>, id: Int): Int
}

package leetcoding.algorithms.problem0086

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 86](https://leetcode.com/problems/partition-list/)
 * */
interface Solution : ISolution<Pair<ListNode?, Int>, ListNode?> {

    override fun solve(input: Pair<ListNode?, Int>): ListNode? = partition(input.first?.copy(), input.second)

    fun partition(head: ListNode?, x: Int): ListNode?
}

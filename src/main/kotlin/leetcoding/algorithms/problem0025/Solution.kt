package leetcoding.algorithms.problem0025

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 25](https://leetcode.com/problems/reverse-nodes-in-k-group/)
 * */
interface Solution : ISolution<Pair<ListNode?, Int>, ListNode?> {

    override fun solve(input: Pair<ListNode?, Int>): ListNode? = reverseKGroup(input.first?.copy(), input.second)

    fun reverseKGroup(head: ListNode?, k: Int): ListNode?
}

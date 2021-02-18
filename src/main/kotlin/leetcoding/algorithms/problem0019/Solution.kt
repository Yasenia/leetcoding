package leetcoding.algorithms.problem0019

import leetcoding.core.ISolution

/**
 * [Problem 19](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 * */
interface Solution : ISolution<Pair<ListNode?, Int>, ListNode?> {

    override fun solve(input: Pair<ListNode?, Int>): ListNode? = removeNthFromEnd(input.first, input.second)

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode?
}

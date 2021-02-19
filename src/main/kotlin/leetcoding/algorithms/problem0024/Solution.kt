package leetcoding.algorithms.problem0024

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 24](https://leetcode.com/problems/swap-nodes-in-pairs/)
 * */
interface Solution : ISolution<ListNode?, ListNode?> {

    override fun solve(input: ListNode?): ListNode? = swapPairs(input?.copy())

    fun swapPairs(head: ListNode?): ListNode?
}

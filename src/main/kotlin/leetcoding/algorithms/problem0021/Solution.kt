package leetcoding.algorithms.problem0021

import leetcoding.core.ISolution

interface Solution : ISolution<Pair<ListNode?, ListNode?>, ListNode?> {

    override fun solve(input: Pair<ListNode?, ListNode?>): ListNode? = mergeTwoLists(input.first, input.second)

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode?
}

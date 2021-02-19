package leetcoding.algorithms.problem0023

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 23](https://leetcode.com/problems/merge-k-sorted-lists/)
 * */
interface Solution : ISolution<Array<ListNode?>, ListNode?> {

    override fun solve(input: Array<ListNode?>): ListNode? = mergeKLists(input)

    fun mergeKLists(lists: Array<ListNode?>): ListNode?
}

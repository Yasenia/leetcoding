package leetcoding.algorithms.problem0083

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 83](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 * */
interface Solution : ISolution<ListNode?, ListNode?> {

    override fun solve(input: ListNode?): ListNode? = deleteDuplicates(input?.copy())

    fun deleteDuplicates(head: ListNode?): ListNode?
}

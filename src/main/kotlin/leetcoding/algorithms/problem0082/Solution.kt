package leetcoding.algorithms.problem0082

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 82](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
 * */
interface Solution : ISolution<ListNode?, ListNode?> {

    override fun solve(input: ListNode?): ListNode? = deleteDuplicates(input?.copy())

    fun deleteDuplicates(head: ListNode?): ListNode?
}

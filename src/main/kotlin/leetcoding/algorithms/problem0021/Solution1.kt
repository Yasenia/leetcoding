package leetcoding.algorithms.problem0021

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? = mergeTwoLists(l1, l2, ListNode(0))

    private tailrec fun mergeTwoLists(l1: ListNode?, l2: ListNode?, mergedHead: ListNode, last: ListNode = mergedHead): ListNode? = when {
        l1 == null && l2 == null -> mergedHead.next
        l1 == null || (l2 != null && l1.value > l2.value) -> mergeTwoLists(l2, l1, mergedHead, last)
        else -> {
            val newLast = ListNode(l1.value)
            last.next = newLast
            mergeTwoLists(l1.next, l2, mergedHead, newLast)
        }
    }
}

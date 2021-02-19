package leetcoding.algorithms.problem0021

import leetcoding.core.datastructure.ListNode

class Solution2 : Solution {

    override fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? = when {
        l1 == null -> l2
        l2 == null || l1.value > l2.value -> mergeTwoLists(l2, l1)
        else -> ListNode(l1.value).also { it.next = mergeTwoLists(l1.next, l2) }
    }
}

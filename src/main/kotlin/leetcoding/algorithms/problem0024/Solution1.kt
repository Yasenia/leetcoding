package leetcoding.algorithms.problem0024

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun swapPairs(head: ListNode?): ListNode? {
        val next = head?.next ?: return head
        head.next = swapPairs(next.next)
        next.next = head
        return next
    }
}

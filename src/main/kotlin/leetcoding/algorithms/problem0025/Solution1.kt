package leetcoding.algorithms.problem0025

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        val kthNode = generateSequence(head) { it.next }.elementAtOrNull(k - 1) ?: return head
        var pre = reverseKGroup(kthNode.next, k)
        var current = head
        repeat(k) {
            val next = current?.next
            current?.next = pre
            pre = current
            current = next
        }
        return pre
    }
}

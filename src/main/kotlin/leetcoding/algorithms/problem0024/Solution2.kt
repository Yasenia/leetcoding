package leetcoding.algorithms.problem0024

import leetcoding.core.datastructure.ListNode

class Solution2 : Solution {

    override fun swapPairs(head: ListNode?): ListNode? {
        val dummy = ListNode(0).also { it.next = head }
        var pre = dummy
        while (true) {
            val first = pre.next ?: break
            val second = first.next ?: break
            pre.next = second
            first.next = second.next
            second.next = first
            pre = first
        }
        return dummy.next
    }
}

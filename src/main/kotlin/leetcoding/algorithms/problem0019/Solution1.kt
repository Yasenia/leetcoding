package leetcoding.algorithms.problem0019

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val preHead = ListNode(0, head)
        var preLastNthNode: ListNode? = null
        var node = head
        var i = 0
        while (node != null) {
            node = node.next
            if (++i >= n) preLastNthNode = preLastNthNode?.next ?: preHead
        }
        preLastNthNode?.next = preLastNthNode?.next?.next
        return preHead.next
    }
}

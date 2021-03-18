package leetcoding.algorithms.problem0092

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val dummy = ListNode(0, head)
        var preLeftNode: ListNode? = dummy
        repeat(left - 1) { preLeftNode = preLeftNode?.next }
        val leftNode = preLeftNode?.next
        var preNode = preLeftNode
        var node = leftNode
        repeat(right - left + 1) {
            val next = node?.next
            node?.next = preNode
            preNode = node
            node = next
        }
        preLeftNode?.next = preNode
        leftNode?.next = node
        return dummy.next
    }
}

package leetcoding.algorithms.problem0086

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun partition(head: ListNode?, x: Int): ListNode? {
        val lessThanHead = ListNode(0)
        val greatThanHead = ListNode(0)
        var node = head
        var lessThanNode = lessThanHead
        var greatThanNode = greatThanHead
        while (node != null) {
            if (node.value < x) {
                lessThanNode.next = node
                lessThanNode = node
            } else {
                greatThanNode.next = node
                greatThanNode = node
            }
            node = node.next
        }
        lessThanNode.next = greatThanHead.next
        greatThanNode.next = null
        return lessThanHead.next
    }
}

package leetcoding.algorithms.problem0083

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current?.next != null) {
            if (current.value == current.next?.value) current.next = current.next?.next
            else current = current.next
        }
        return head
    }
}

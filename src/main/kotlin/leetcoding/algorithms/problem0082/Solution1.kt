package leetcoding.algorithms.problem0082

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun deleteDuplicates(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var pre = dummy
        var current = head
        var duplicated: Int? = null
        while (current != null) {
            if (current.value == current.next?.value || current.value == duplicated) {
                duplicated = current.value
            } else {
                pre.next = current
                pre = current
            }
            current = current.next
        }
        pre.next = null
        return dummy.next
    }
}

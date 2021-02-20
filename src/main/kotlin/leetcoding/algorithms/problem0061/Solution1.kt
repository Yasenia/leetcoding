package leetcoding.algorithms.problem0061

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (k == 0 || head == null) return head
        var left = head
        var right = head
        var rightIndex = 0
        while (right?.next != null) {
            right = right.next
            if (rightIndex++ >= k) left = left?.next
        }
        if (rightIndex < k) return rotateRight(head, k % (rightIndex + 1))
        val rotatedHead = left?.next
        right?.next = head
        left?.next = null
        return rotatedHead
    }
}

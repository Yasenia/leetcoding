package leetcoding.algorithms.problem0082

import leetcoding.core.datastructure.ListNode

class Solution2 : Solution {

    override fun deleteDuplicates(head: ListNode?): ListNode? = deleteDuplicates(head, null)

    private fun deleteDuplicates(head: ListNode?, duplicated: Int?): ListNode? = when (val value = head?.value) {
        null -> head
        duplicated, head.next?.value -> deleteDuplicates(head.next, value)
        else -> ListNode(value).also { it.next = deleteDuplicates(head.next, null) }
    }
}

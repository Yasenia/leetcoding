package leetcoding.algorithms.problem0002

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun addTwoNumbers(number1: ListNode?, number2: ListNode?): ListNode? = addTwoNumbers(number1, number2, 0)

    private fun addTwoNumbers(number1: ListNode?, number2: ListNode?, carry: Int): ListNode? {
        if (number1 == null && number2 == null && carry == 0) return null
        val value = (number1?.value ?: 0) + (number2?.value ?: 0) + carry
        return ListNode(value % 10, addTwoNumbers(number1?.next, number2?.next, value / 10))
    }
}

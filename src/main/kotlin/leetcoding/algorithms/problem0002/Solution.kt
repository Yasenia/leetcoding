package leetcoding.algorithms.problem0002

import leetcoding.core.ISolution

/**
 * [Problem 2](https://leetcode.com/problems/add-two-numbers/)
*/
interface Solution : ISolution<Pair<ListNode?, ListNode?>, ListNode?> {

    override fun solve(input: Pair<ListNode?, ListNode?>): ListNode? = addTwoNumbers(input.first, input.second)

    fun addTwoNumbers(number1: ListNode?, number2: ListNode?): ListNode?
}

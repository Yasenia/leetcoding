package leetcoding.algorithms.problem0092

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 92](https://leetcode.com/problems/reverse-linked-list-ii/)
 * */
interface Solution : ISolution<Triple<ListNode?, Int, Int>, ListNode?> {

    override fun solve(input: Triple<ListNode?, Int, Int>): ListNode? = reverseBetween(input.first?.copy(), input.second, input.third)

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode?
}

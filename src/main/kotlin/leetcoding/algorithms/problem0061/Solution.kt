package leetcoding.algorithms.problem0061

import leetcoding.core.ISolution
import leetcoding.core.datastructure.ListNode

/**
 * [Problem 61](https://leetcode.com/problems/rotate-list/)
 * */
interface Solution : ISolution<Pair<ListNode?, Int>, ListNode?> {

    override fun solve(input: Pair<ListNode?, Int>): ListNode? = rotateRight(input.first?.copy(), input.second)

    fun rotateRight(head: ListNode?, k: Int): ListNode?
}

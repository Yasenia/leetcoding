package leetcoding.algorithms.problem0456

import java.util.Stack

class Solution2 : Solution {

    override fun find132pattern(nums: IntArray): Boolean {
        val minBefore = IntArray(nums.size) { Int.MAX_VALUE }
        for (i in 0 until nums.lastIndex) minBefore[i + 1] = minOf(nums[i], minBefore[i])
        val stack = Stack<Int>()
        for (i in nums.lastIndex downTo 1) {
            if (minBefore[i] >= nums[i]) continue
            while (stack.isNotEmpty() && stack.peek() <= minBefore[i]) stack.pop()
            if (stack.isNotEmpty() && stack.peek() < nums[i]) return true
            stack.push(nums[i])
        }
        return false
    }
}

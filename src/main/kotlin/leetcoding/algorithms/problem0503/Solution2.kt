package leetcoding.algorithms.problem0503

import java.util.Stack

class Solution2 : Solution {

    override fun nextGreaterElements(nums: IntArray): IntArray {
        val stack = Stack<Int>()
        val nextGreater = IntArray(nums.size) { -1 }
        for (i in 0 until nums.size * 2) {
            val index = i % nums.size
            while (stack.isNotEmpty() && nums[stack.peek()] < nums[index]) nextGreater[stack.pop()] = nums[index]
            stack.push(index)
        }
        return nextGreater
    }
}

package leetcoding.algorithms.problem0503

class Solution1 : Solution {

    override fun nextGreaterElements(nums: IntArray): IntArray {
        val nextGreater = IntArray(nums.size) { -1 }
        for (i in nums.indices) {
            for (j in 1..nums.lastIndex) {
                val next = (i + j) % nums.size
                if (nums[next] > nums[i]) {
                    nextGreater[i] = nums[next]
                    break
                }
            }
        }
        return nextGreater
    }
}

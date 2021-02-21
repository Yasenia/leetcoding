package leetcoding.algorithms.problem1438

import java.util.Deque
import java.util.LinkedList

class Solution3 : Solution {

    override fun longestSubarray(nums: IntArray, limit: Int): Int {
        val minQueue: Deque<Int> = LinkedList()
        val maxQueue: Deque<Int> = LinkedList()
        var longest = 0
        var left = 0
        for (right in nums.indices) {
            while (minQueue.isNotEmpty() && minQueue.peekLast() > nums[right]) minQueue.pollLast()
            while (maxQueue.isNotEmpty() && maxQueue.peekLast() < nums[right]) maxQueue.pollLast()
            minQueue.offerLast(nums[right])
            maxQueue.offerLast(nums[right])
            while (maxQueue.isNotEmpty() && minQueue.isNotEmpty() && maxQueue.peekFirst() - minQueue.peekFirst() > limit) {
                if (nums[left] == maxQueue.peekFirst()) maxQueue.pollFirst()
                if (nums[left] == minQueue.peekFirst()) minQueue.pollFirst()
                left++
            }
            longest = longest.coerceAtLeast(right + 1 - left)
        }
        return longest
    }
}

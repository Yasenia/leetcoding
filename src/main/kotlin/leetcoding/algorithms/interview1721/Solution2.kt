package leetcoding.algorithms.interview1721

class Solution2 : Solution {

    override fun trap(heights: IntArray): Int {
        var leftMax = 0
        var rightMax = 0
        var left = 0
        var right = heights.lastIndex
        var sum = 0
        while (left < right) {
            leftMax = leftMax.coerceAtLeast(heights[left])
            rightMax = rightMax.coerceAtLeast(heights[right])
            sum += if (heights[left] < heights[right]) leftMax - heights[left++] else rightMax - heights[right--]
        }
        return sum
    }
}

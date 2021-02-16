package leetcoding.algorithms.problem0011

class Solution2 : Solution {

    override fun maxArea(height: IntArray): Int = maxArea(height, 0, height.lastIndex)

    private fun maxArea(height: IntArray, left: Int, right: Int): Int {
        if (left == right) return 0
        val leftHeight = height[left]
        val rightHeight = height[right]
        val width = right - left
        return if (leftHeight > rightHeight) maxOf(width * rightHeight, maxArea(height, left, right - 1))
        else maxOf(width * leftHeight, maxArea(height, left + 1, right))
    }
}

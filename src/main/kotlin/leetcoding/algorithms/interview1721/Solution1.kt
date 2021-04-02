package leetcoding.algorithms.interview1721

class Solution1 : Solution {

    override fun trap(heights: IntArray): Int {
        val leftMaxHeights = heights.scan(0, ::maxOf)
        val rightMaxHeights = heights.reversed().scan(0, ::maxOf).reversed()
        return heights.indices.sumBy { (minOf(leftMaxHeights[it], rightMaxHeights[it]) - heights[it]).coerceAtLeast(0) }
    }
}

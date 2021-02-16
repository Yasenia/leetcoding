package leetcoding.algorithms.problem0011

class Solution1 : Solution {

    override fun maxArea(height: IntArray): Int {
        var max = 0
        for (i in height.indices) {
            for (step in 1..height.lastIndex - i) {
                val v = step * minOf(height[i], height[i + step])
                if (v > max) max = v
            }
        }
        return max
    }
}

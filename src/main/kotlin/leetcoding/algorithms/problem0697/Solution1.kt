package leetcoding.algorithms.problem0697

class Solution1 : Solution {

    override fun findShortestSubArray(nums: IntArray): Int {
        val counter = mutableMapOf<Int, Int>()
        val firstIndices = mutableMapOf<Int, Int>()
        var shortest = nums.size
        var maxDegree = 0
        for (i in nums.indices) {
            val num = nums[i]
            val count = counter.compute(num) { _, c -> (c ?: 0) + 1 }!!
            val firstIndex = firstIndices.computeIfAbsent(num) { i }
            if (count > maxDegree) shortest = i - firstIndex + 1
            if (count == maxDegree) shortest = shortest.coerceAtMost(i - firstIndex + 1)
            maxDegree = maxDegree.coerceAtLeast(count)
        }
        return shortest
    }
}

package leetcoding.algorithms.problem0016

import kotlin.math.abs

class Solution1 : Solution {

    override fun threeSumClosest(nums: IntArray, target: Int): Int {
        val sortedNums = nums.sorted()
        var closest = nums.take(3).sum()
        for (i in sortedNums.indices) {
            val x = sortedNums[i]
            if (i > 0 && x == sortedNums[i - 1]) continue
            var j = i + 1
            var k = sortedNums.lastIndex
            while (j < k) {
                val y = sortedNums[j]
                val z = sortedNums[k]
                val sum = x + y + z
                val diff = sum - target
                if (diff == 0) return target
                if ((abs(diff) < abs(closest - target))) closest = sum
                if (diff < 0) do { j++ } while (j < sortedNums.lastIndex && sortedNums[j] == y)
                if (diff > 0) do { k-- } while (k > i && sortedNums[k] == z)
            }
        }
        return closest
    }
}

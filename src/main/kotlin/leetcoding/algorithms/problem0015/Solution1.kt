package leetcoding.algorithms.problem0015

class Solution1 : Solution {

    override fun threeSum(nums: IntArray): List<List<Int>> {
        val sortedNums = nums.sorted()
        val result = mutableListOf<List<Int>>()
        for (i in sortedNums.indices) {
            val x = sortedNums[i]
            if (i > 0 && x == sortedNums[i - 1]) continue
            if (x > 0) break
            var j = i + 1
            var k = sortedNums.lastIndex
            while (j < k) {
                val y = sortedNums[j]
                val z = sortedNums[k]
                val sum = x + y + z
                if (sum == 0) result.add(listOf(x, y, z))
                if (sum <= 0) do { j++ } while (j < sortedNums.lastIndex && sortedNums[j] == y)
                if (sum >= 0) do { k-- } while (k > i && sortedNums[k] == z)
            }
        }
        return result
    }
}

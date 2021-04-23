package leetcoding.algorithms.problem0368

class Solution1 : Solution {

    override fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val sortedNums = nums.sortedArray()
        val largestSizeDp = IntArray(nums.size)
        val nextDp = IntArray(nums.size) { -1 }
        var largestSize = 0
        var largestIndex = sortedNums.lastIndex
        for (i in sortedNums.lastIndex downTo 0) {
            val num = sortedNums[i]
            var nextLargestSize = 0
            for (j in i + 1..sortedNums.lastIndex) if (sortedNums[j] % num == 0 && largestSizeDp[j] > nextLargestSize) {
                nextDp[i] = j
                nextLargestSize = largestSizeDp[j]
            }
            if (nextLargestSize >= largestSize) {
                largestSize = nextLargestSize + 1
                largestIndex = i
            }
            largestSizeDp[i] = nextLargestSize + 1
        }
        return generateSequence(largestIndex) { nextDp[it] }.takeWhile { it >= 0 }.map { sortedNums[it] }.toList()
    }
}

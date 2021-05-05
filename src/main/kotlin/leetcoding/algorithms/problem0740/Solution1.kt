package leetcoding.algorithms.problem0740

class Solution1 : Solution {

    override fun deleteAndEarn(nums: IntArray): Int {
        val counter = mutableMapOf<Int, Int>()
        for (num in nums) counter.compute(num) { _, count -> count?.inc() ?: 1 }
        val sortedKeys = counter.keys.sorted()
        val dpWithLast = IntArray(sortedKeys.size)
        val dpWithoutLast = IntArray(sortedKeys.size)
        dpWithLast[0] = sortedKeys[0] * counter.getValue(sortedKeys[0])
        for (i in 0 until sortedKeys.lastIndex) {
            val num = sortedKeys[i + 1]
            val earn = num * counter.getValue(num)
            dpWithoutLast[i + 1] = maxOf(dpWithLast[i], dpWithoutLast[i])
            dpWithLast[i + 1] = (if (num == sortedKeys[i] + 1) dpWithoutLast[i] else dpWithoutLast[i + 1]) + earn
        }
        return maxOf(dpWithLast.last(), dpWithoutLast.last())
    }
}

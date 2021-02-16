package leetcoding.algorithms.problem0448

class Solution1 : Solution {

    override fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val counter = IntArray(nums.size)
        for (n in nums) counter[n - 1]++
        return counter.withIndex().filter { it.value == 0 }.map { it.index + 1 }
    }
}

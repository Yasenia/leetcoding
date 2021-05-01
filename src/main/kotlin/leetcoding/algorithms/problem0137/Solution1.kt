package leetcoding.algorithms.problem0137

class Solution1 : Solution {

    override fun singleNumber(nums: IntArray): Int {
        val hash = mutableMapOf<Int, Int>()
        for (num in nums) hash.compute(num) { _, c -> c?.inc() ?: 1 }
        return hash.entries.first { it.value == 1 }.key
    }
}

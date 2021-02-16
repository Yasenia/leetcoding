package leetcoding.algorithms.problem0448

class Solution2 : Solution {

    override fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for (i in nums.indices) {
            while (true) {
                val num = nums[i]
                if (num == i + 1) break
                val target = nums[num - 1]
                if (num == target) break
                nums[num - 1] = num
                nums[i] = target
            }
        }
        return nums.withIndex().filter { it.value != it.index + 1 }.map { it.index + 1 }
    }
}

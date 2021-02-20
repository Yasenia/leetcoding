package leetcoding.algorithms.problem0027

class Solution1 : Solution {

    override fun removeElement(nums: IntArray, value: Int): Int {
        var size = 0
        for (j in nums.indices) if (nums[j] != value) nums[size++] = nums[j]
        return size
    }
}

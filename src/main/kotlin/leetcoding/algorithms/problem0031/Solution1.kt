package leetcoding.algorithms.problem0031

class Solution1 : Solution {

    override fun nextPermutation(nums: IntArray) {
        var i = nums.lastIndex - 1
        while (i >= 0 && nums[i] >= nums[i + 1]) i--
        if (i >= 0) {
            var j = i
            while (j < nums.lastIndex && nums[j + 1] > nums[i]) j++
            nums.swap(i, j)
        }
        for (j in 0 until (nums.lastIndex - i) / 2) nums.swap(i + 1 + j, nums.lastIndex - j)
    }

    private fun IntArray.swap(i: Int, j: Int) { this[i] = this[j].also { this[j] = this[i] } }
}

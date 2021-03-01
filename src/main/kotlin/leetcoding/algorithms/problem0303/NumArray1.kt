package leetcoding.algorithms.problem0303

class NumArray1(private val nums: IntArray) : NumArray {

    private val dp = Array(nums.size) { Array<Int?>(nums.size) { null } }

    override fun sumRange(i: Int, j: Int): Int {
        if (i > j) return 0
        val sum = dp[i][j] ?: sumRange(i, j - 1) + nums[j]
        dp[i][j] = sum
        return sum
    }
}

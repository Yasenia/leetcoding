package leetcoding.algorithms.problem0303

class NumArray2(nums: IntArray) : NumArray {

    private val prefixSum = IntArray(nums.size)

    init { for (i in nums.indices) prefixSum[i] = prefixSum.getOrElse(i - 1) { 0 } + nums[i] }

    override fun sumRange(i: Int, j: Int): Int = prefixSum[j] - prefixSum.getOrElse(i - 1) { 0 }
}

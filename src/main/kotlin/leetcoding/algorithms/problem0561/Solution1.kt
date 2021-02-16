package leetcoding.algorithms.problem0561

class Solution1 : Solution {

    override fun arrayPairSum(nums: IntArray): Int = nums.sorted().filterIndexed { i, _ -> i % 2 == 0 }.sum()
}

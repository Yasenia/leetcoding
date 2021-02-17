package leetcoding.algorithms.problem0566

class Solution1 : Solution {

    override fun matrixReshape(nums: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val or = nums.size.takeIf { it > 0 } ?: return nums
        val oc = nums.first().size.takeIf { it > 0 } ?: return nums
        if (or * oc != r * c) return nums
        return Array(r) { i -> IntArray(c) { j -> nums[(i * c + j) / oc][(i * c + j) % oc] } }
    }
}

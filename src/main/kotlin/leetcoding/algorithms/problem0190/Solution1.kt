package leetcoding.algorithms.problem0190

class Solution1 : Solution {

    override fun reverseBits(n: Int): Int {
        var result = 0
        for (i in 0..31) if (1 shl i and n != 0) result = 1 shl 31 - i or result
        return result
    }
}

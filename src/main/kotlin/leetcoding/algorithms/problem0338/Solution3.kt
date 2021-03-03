package leetcoding.algorithms.problem0338

class Solution3 : Solution {

    override fun countBits(num: Int): IntArray {
        val result = IntArray(num + 1)
        var highestBit = 1
        for (i in 1..result.lastIndex) {
            if (i >= highestBit shl 1) highestBit = highestBit shl 1
            result[i] = result[i - highestBit] + 1
        }
        return result
    }
}

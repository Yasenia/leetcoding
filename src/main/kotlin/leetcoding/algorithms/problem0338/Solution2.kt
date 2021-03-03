package leetcoding.algorithms.problem0338

class Solution2 : Solution {

    override fun countBits(num: Int): IntArray {
        val result = IntArray(num + 1)
        var bit = 1
        while (bit <= num) {
            for (i in bit..num step (bit shl 1)) for (j in i until (i + bit).coerceAtMost(num + 1)) result[j]++
            bit = bit shl 1
        }
        return result
    }
}

package leetcoding.algorithms.problem1720

class Solution1 : Solution {

    override fun decode(encoded: IntArray, first: Int): IntArray {
        val result = IntArray(encoded.size + 1)
        result[0] = first
        for (i in encoded.indices) result[i + 1] = result[i] xor encoded[i]
        return result
    }
}

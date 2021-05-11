package leetcoding.algorithms.problem1734

class Solution1 : Solution {

    override fun decode(encoded: IntArray): IntArray {
        val perm = IntArray(encoded.size + 1)
        for (i in 0..encoded.size) perm[0] = perm[0] xor (i + 1)
        for (i in 1..encoded.lastIndex step 2) perm[0] = perm[0] xor encoded[i]
        for (i in 1..perm.lastIndex) perm[i] = perm[i - 1] xor encoded[i - 1]
        return perm
    }
}

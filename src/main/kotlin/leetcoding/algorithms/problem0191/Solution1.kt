package leetcoding.algorithms.problem0191

class Solution1 : Solution {

    override fun hammingWeight(n: Int): Int {
        var k = if (n >= 0) n else -n - 1
        var count = 0
        while (k != 0) {
            if (k and 1 == 1) count++
            k = k shr 1
        }
        return if (n >= 0) count else 32 - count
    }
}

package leetcoding.algorithms.problem0191

class Solution2 : Solution {

    override fun hammingWeight(n: Int): Int {
        var k = n
        var count = 0
        while (k != 0) {
            k = k and (k - 1)
            count++
        }
        return count
    }
}

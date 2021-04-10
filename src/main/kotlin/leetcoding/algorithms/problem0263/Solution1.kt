package leetcoding.algorithms.problem0263

class Solution1 : Solution {

    override fun isUgly(n: Int): Boolean {
        if (n <= 0) return false
        var k = n
        while (k % 2 == 0) k /= 2
        while (k % 3 == 0) k /= 3
        while (k % 5 == 0) k /= 5
        return k == 1
    }
}

package leetcoding.algorithms.problem1486

class Solution1 : Solution {

    override fun xorOperation(n: Int, start: Int): Int {
        var result = 0
        for (i in 0 until n) result = result xor (start + 2 * i)
        return result
    }
}

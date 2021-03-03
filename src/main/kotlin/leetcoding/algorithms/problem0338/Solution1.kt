package leetcoding.algorithms.problem0338

class Solution1 : Solution {

    override fun countBits(num: Int): IntArray = IntArray(num + 1) {
        var count = 0
        var i = it
        while (i > 0) {
            if (i and 1 == 1) count++
            i = i shr 1
        }
        count
    }
}

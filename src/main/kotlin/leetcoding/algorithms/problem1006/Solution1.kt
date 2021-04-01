package leetcoding.algorithms.problem1006

class Solution1 : Solution {

    override fun clumsy(n: Int): Int {
        var acc = 0
        var sign = 1
        for (i in n downTo 1 step 4) {
            acc += if (i <= 2) sign * i else sign * i * (i - 1) / (i - 2) + (i - 3)
            sign = -1
        }
        return acc
    }
}

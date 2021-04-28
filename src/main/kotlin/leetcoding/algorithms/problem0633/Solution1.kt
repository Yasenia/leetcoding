package leetcoding.algorithms.problem0633

import kotlin.math.sqrt

class Solution1 : Solution {

    override fun judgeSquareSum(c: Int): Boolean {
        for (a in 0..sqrt(c / 2.0).toInt()) {
            val b = sqrt((c - a * a).toDouble()).toInt()
            if (a * a + b * b == c) return true
        }
        return false
    }
}

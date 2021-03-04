package leetcoding.algorithms.problem0492

import kotlin.math.sqrt

class Solution1 : Solution {

    override fun constructRectangle(area: Int): IntArray = (sqrt(area.toDouble()).toInt() downTo 1)
        .first { area % it == 0 }
        .let { intArrayOf(it, area / it) }
}

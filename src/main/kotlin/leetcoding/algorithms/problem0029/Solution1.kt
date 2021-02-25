package leetcoding.algorithms.problem0029

class Solution1 : Solution {

    override fun divide(dividend: Int, divisor: Int): Int {
        val (quotient, _) = divideLong(dividend.toLong(), divisor.toLong())
        return quotient.coerceAtMost(Int.MAX_VALUE.toLong()).coerceAtLeast(Int.MIN_VALUE.toLong()).toInt()
    }

    private fun divideLong(dividend: Long, divisor: Long): Pair<Long, Long> = when {
        dividend < 0 -> divideLong(-dividend, divisor).let { Pair(-it.first, -it.second) }
        divisor < 0 -> divideLong(dividend, -divisor).let { Pair(-it.first, -it.second) }
        dividend < divisor -> Pair(0, dividend)
        else -> {
            val (doubleQuotient, doubleRemainder) = divideLong(dividend, divisor + divisor)
            if (doubleRemainder < divisor) Pair(doubleQuotient + doubleQuotient, doubleRemainder)
            else Pair(doubleQuotient + doubleQuotient + 1, doubleRemainder - divisor)
        }
    }
}

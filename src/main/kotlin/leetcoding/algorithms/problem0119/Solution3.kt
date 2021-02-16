package leetcoding.algorithms.problem0119

class Solution3 : Solution {

    override fun getRow(rowIndex: Int): List<Int> = (0..rowIndex).map { combNumber(it, rowIndex) }

    private fun combNumber(m: Int, n: Int): Int {
        if (m > n / 2) return combNumber(n - m, n)
        var acc = Pair(1, 1)
        var i = m
        var j = n
        while (i > 0) acc = multi(acc, Pair(i--, j--))
        return acc.second / acc.first
    }

    private fun multi(x: Pair<Int, Int>, y: Pair<Int, Int>): Pair<Int, Int> {
        val (xm, xd) = x
        val (ym, yd) = y
        val gcdX = gcd(xm, xd)
        val gcdY = gcd(ym, yd)
        val gcdXY = gcd(xm / gcdX, yd / gcdY)
        val gcdYX = gcd(ym / gcdY, xd / gcdX)
        return Pair(xm / gcdX / gcdXY * (ym / gcdY / gcdYX), xd / gcdX / gcdYX * (yd / gcdY / gcdXY))
    }

    private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

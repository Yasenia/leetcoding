package leetcoding.algorithms.problem0013

class Solution1 : Solution {

    override fun romanToInt(s: String): Int = romanToInt(s, 0)

    private fun romanToInt(s: CharSequence, acc: Int): Int = when {
        s.startsWith("IV") -> romanToInt(s.substring(2), acc + 4)
        s.startsWith("IX") -> romanToInt(s.substring(2), acc + 9)
        s.startsWith("XL") -> romanToInt(s.substring(2), acc + 40)
        s.startsWith("XC") -> romanToInt(s.substring(2), acc + 90)
        s.startsWith("CD") -> romanToInt(s.substring(2), acc + 400)
        s.startsWith("CM") -> romanToInt(s.substring(2), acc + 900)
        s.startsWith("I") -> romanToInt(s.substring(1), acc + 1)
        s.startsWith("V") -> romanToInt(s.substring(1), acc + 5)
        s.startsWith("X") -> romanToInt(s.substring(1), acc + 10)
        s.startsWith("L") -> romanToInt(s.substring(1), acc + 50)
        s.startsWith("C") -> romanToInt(s.substring(1), acc + 100)
        s.startsWith("D") -> romanToInt(s.substring(1), acc + 500)
        s.startsWith("M") -> romanToInt(s.substring(1), acc + 1000)
        else -> acc
    }
}

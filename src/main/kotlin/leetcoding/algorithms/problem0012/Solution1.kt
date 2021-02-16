package leetcoding.algorithms.problem0012

class Solution1 : Solution {

    override fun intToRoman(num: Int): String = when {
        num >= 1000 -> "M" + intToRoman(num - 1000)
        num >= 900 -> "CM" + intToRoman(num - 900)
        num >= 500 -> "D" + intToRoman(num - 500)
        num >= 400 -> "CD" + intToRoman(num - 400)
        num >= 100 -> "C" + intToRoman(num - 100)
        num >= 90 -> "XC" + intToRoman(num - 90)
        num >= 50 -> "L" + intToRoman(num - 50)
        num >= 40 -> "XL" + intToRoman(num - 40)
        num >= 10 -> "X" + intToRoman(num - 10)
        num >= 9 -> "IX" + intToRoman(num - 9)
        num >= 5 -> "V" + intToRoman(num - 5)
        num >= 4 -> "IV" + intToRoman(num - 4)
        num >= 1 -> "I" + intToRoman(num - 1)
        else -> ""
    }
}

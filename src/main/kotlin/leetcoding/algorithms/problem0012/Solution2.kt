package leetcoding.algorithms.problem0012

class Solution2 : Solution {

    companion object {
        private val symbols = listOf(
            1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
            100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
            10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
        )
    }

    override fun intToRoman(num: Int): String = intToRoman(num, "")

    private fun intToRoman(number: Int, prefix: String): String {
        val (value, symbol) = symbols.firstOrNull { (v, _) -> number >= v } ?: return prefix
        return intToRoman(number - value, prefix + symbol)
    }
}

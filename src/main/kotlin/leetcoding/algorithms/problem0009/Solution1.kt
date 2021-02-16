package leetcoding.algorithms.problem0009

class Solution1 : Solution {

    override fun isPalindrome(x: Int): Boolean = x >= 0 && isPalindromeArray(toDigitArray(x))

    private fun toDigitArray(x: Int): IntArray = if (x < 10) intArrayOf(x) else toDigitArray(x / 10) + x % 10

    private fun isPalindromeArray(digits: IntArray): Boolean =
        digits.size <= 1 || (digits.first() == digits.last() && isPalindromeArray(digits.sliceArray(1 until digits.size - 1)))
}

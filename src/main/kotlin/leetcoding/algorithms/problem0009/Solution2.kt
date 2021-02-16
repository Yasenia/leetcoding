package leetcoding.algorithms.problem0009

class Solution2 : Solution {

    override fun isPalindrome(x: Int): Boolean = x >= 0 && x == reverseNum(x)

    private fun reverseNum(x: Int, acc: Int = 0): Int = if (x == 0) acc else reverseNum(x / 10, acc * 10 + x % 10)
}

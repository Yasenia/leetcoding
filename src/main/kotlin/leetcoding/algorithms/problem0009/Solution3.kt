package leetcoding.algorithms.problem0009

class Solution3 : Solution {

    override fun isPalindrome(x: Int): Boolean = isPalindrome(x, 0)

    private fun isPalindrome(x: Int, acc: Int): Boolean {
        if (x < 0) return false // negative number
        if (x % 10 == 0 && acc == 0) return x == 0 // number end with 0
        if (x == acc || x / 10 == acc) return true // is palindrome
        if (x < acc) return false // is not palindrome
        return isPalindrome(x / 10, acc * 10 + x % 10)
    }
}

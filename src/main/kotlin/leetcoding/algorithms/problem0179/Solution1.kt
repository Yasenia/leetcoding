package leetcoding.algorithms.problem0179

class Solution1 : Solution {

    override fun largestNumber(nums: IntArray): String {
        val result = nums.sortedWith { a, b -> "$b$a".compareTo("$a$b") }.joinToString("")
        return result.takeUnless { it.startsWith('0') } ?: "0"
    }
}

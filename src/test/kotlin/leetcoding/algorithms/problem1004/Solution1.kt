package leetcoding.algorithms.problem1004

class Solution1 : Solution {

    override fun longestOnes(arr: IntArray, k: Int): Int {
        var left = 0
        var right = 0
        var longest = 0
        var zeros = 0
        while (right <= arr.lastIndex) {
            if (arr[right++] == 0) zeros++
            while (zeros > k) if (arr[left++] == 0) zeros--
            longest = longest.coerceAtLeast(right - left)
        }
        return longest
    }
}

package leetcoding.algorithms.problem0992

class Solution3 : Solution {

    override fun subarraysWithKDistinct(array: IntArray, k: Int): Int = subarraysAtMostK(array, k) - subarraysAtMostK(array, k - 1)

    private fun subarraysAtMostK(array: IntArray, k: Int): Int {
        var count = 0
        var left = 0
        var right = -1
        var freq = mapOf<Int, Int>()
        while (right < array.lastIndex) {
            right++
            if (right in array.indices) {
                val rk = array[right]
                val rv = freq[rk] ?: 0
                freq = freq + (rk to rv + 1)
            }
            while (freq.size > k) {
                if (left in array.indices) {
                    val lk = array[left]
                    val lv = freq[lk] ?: 0
                    freq = if (lv <= 1) freq - lk else freq + (lk to lv - 1)
                }
                left++
            }
            count += right - left + 1
        }
        return count
    }
}

package leetcoding.algorithms.problem0076

class Solution1 : Solution {

    override fun minWindow(s: String, t: String): String {
        val flag = BooleanArray(128)
        val counters = IntArray(128)
        var count = 0
        for (c in t) {
            flag[c.code] = true
            if (counters[c.code]-- == 0) count--
        }
        var minLeft = -1
        var minRight = s.length
        var left = 0
        for (right in s.indices) {
            if (!flag[s[right].code]) continue
            if (++counters[s[right].code] == 0) count++
            while (left <= right) {
                if (flag[s[left].code] && counters[s[left].code] <= 0) break
                if (flag[s[left].code]) counters[s[left].code]--
                left++
            }
            if (count == 0 && right - left < minRight - minLeft) {
                minLeft = left
                minRight = right
            }
        }
        return if (minLeft < 0 || minRight > s.lastIndex) "" else s.substring(minLeft, minRight + 1)
    }
}

package leetcoding.algorithms.problem0300

import java.util.Collections

class Solution2 : Solution {

    override fun lengthOfLIS(nums: IntArray): Int {
        val list = mutableListOf<Int>()
        for (num in nums) {
            if (list.isEmpty() || num > list.last()) list.add(num)
            else {
                val i = Collections.binarySearch(list, num)
                list[if (i >= 0) i else -i - 1] = num
            }
        }
        return list.size
    }
}

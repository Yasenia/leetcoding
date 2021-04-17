package leetcoding.algorithms.problem0220

import java.util.TreeSet

class Solution1 : Solution {

    override fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        val set = TreeSet<Long>()
        for (i in nums.indices) {
            if (i >= k + 1) set.remove(nums[i - k - 1].toLong())
            val ceiling = set.ceiling(nums[i].toLong() - t)
            if (ceiling != null && ceiling <= nums[i].toLong() + t) return true
            set.add(nums[i].toLong())
        }
        return false
    }
}

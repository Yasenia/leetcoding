package leetcoding.algorithms.problem0004

class Solution1 : Solution {

    override fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val size = nums1.size + nums2.size
        return if (size % 2 != 0) findMedianSortedArrays(nums1, nums2, size / 2).toDouble()
        else (findMedianSortedArrays(nums1, nums2, size / 2 - 1) + findMedianSortedArrays(nums1, nums2, size / 2)) / 2.0
    }

    private tailrec fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray, index: Int, offset1: Int = 0, offset2: Int = 0): Int {
        if (offset1 >= nums1.size) return nums2[offset2 + index]
        if (offset2 >= nums2.size) return nums1[offset1 + index]
        if (index == 0) return minOf(nums1[offset1], nums2[offset2])
        val half = (index + 1) / 2
        val mid1 = nums1.getOrNull(offset1 + half - 1) ?: Int.MAX_VALUE
        val mid2 = nums2.getOrNull(offset2 + half - 1) ?: Int.MAX_VALUE
        val skip1 = if (mid1 <= mid2) half else 0
        val skip2 = if (mid1 > mid2) half else 0
        return findMedianSortedArrays(nums1, nums2, index - half, offset1 + skip1, offset2 + skip2)
    }
}

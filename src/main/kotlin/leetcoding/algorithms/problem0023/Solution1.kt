package leetcoding.algorithms.problem0023

import leetcoding.core.datastructure.ListNode

class Solution1 : Solution {

    override fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val validLists = lists.filterNotNull()
        val (minIndex, minList) = validLists.withIndex().minByOrNull { it.value.value } ?: return null
        val tail = mergeKLists((validLists.take(minIndex) + minList.next + validLists.drop(minIndex + 1)).toTypedArray())
        return ListNode(minList.value).apply { next = tail }
    }
}

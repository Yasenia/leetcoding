package leetcoding.algorithms.problem0023

class Solution2 : Solution {

    override fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val heap = lists.clone()
        for (i in heap.indices) heap.pushUp(i)
        val mergedHead = ListNode(0)
        var mergedLast: ListNode? = mergedHead
        while (true) {
            val min = heap.firstOrNull() ?: break
            mergedLast?.next = ListNode(min.value)
            mergedLast = mergedLast?.next
            heap[0] = min.next
            heap.pushDown(0)
        }
        return mergedHead.next
    }

    private fun Array<ListNode?>.pushDown(index: Int) {
        val leftIndex = index * 2 + 1
        val rightIndex = index * 2 + 2
        val minChildIndex = when {
            leftIndex > this.lastIndex -> return
            rightIndex > this.lastIndex -> leftIndex
            this[leftIndex]?.value ?: Int.MAX_VALUE <= this[rightIndex]?.value ?: Int.MAX_VALUE -> leftIndex
            else -> rightIndex
        }
        val minChild = this[minChildIndex] ?: return
        val node = this[index]
        if (node != null && node.value < minChild.value) return
        this[index] = minChild
        this[minChildIndex] = node
        this.pushDown(minChildIndex)
    }

    private fun Array<ListNode?>.pushUp(index: Int) {
        if (index == 0) return
        val parentIndex = (index - 1) / 2
        val node = this[index] ?: return
        val parent = this[parentIndex]
        if (parent != null && parent.value <= node.value) return
        this[parentIndex] = node
        this[index] = parent
        this.pushUp(parentIndex)
    }
}

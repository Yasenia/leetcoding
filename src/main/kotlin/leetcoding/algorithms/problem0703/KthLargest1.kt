package leetcoding.algorithms.problem0703

class KthLargest1(
    k: Int,
    nums: IntArray
) : KthLargest {

    private var heapSize = 0
    private var heap = IntArray(k) { 0 }

    init {
        for (num in nums) add(num)
    }

    private fun swap(i: Int, j: Int) {
        val iv = heap[i]
        heap[i] = heap[j]
        heap[j] = iv
    }

    private fun pushUp(i: Int) {
        val upIndex = (i - 1) / 2
        if (heap[i] >= heap[upIndex]) return
        swap(i, upIndex)
        pushUp(upIndex)
    }

    private fun pushDown(i: Int) {
        val minDownIndex = when {
            i * 2 + 1 >= heapSize -> return
            i * 2 + 2 >= heapSize -> i * 2 + 1
            heap[i * 2 + 1] <= heap[i * 2 + 2] -> i * 2 + 1
            else -> i * 2 + 2
        }
        if (heap[i] <= heap[minDownIndex]) return
        swap(i, minDownIndex)
        pushDown(minDownIndex)
    }

    private fun insert(value: Int) {
        val lastIndex = heapSize++
        heap[lastIndex] = value
        pushUp(lastIndex)
    }

    private fun delete() {
        heap[0] = heap[--heapSize]
        pushDown(0)
    }

    override fun add(value: Int): Int {
        if (heapSize < heap.size) {
            insert(value)
        } else if (heap.first() < value) {
            delete()
            insert(value)
        }
        return heap[0]
    }
}

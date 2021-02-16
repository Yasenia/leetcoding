package leetcoding.algorithms.problem0978

class Solution2 : Solution {

    override fun maxTurbulenceSize(arr: IntArray): Int =
        if (arr.size <= 1) arr.size
        else arr.asSequence().zipWithNext { a, b -> a.compareTo(b) }
            .fold(Triple(0, 0, 0)) { (maxSize, preSize, preDiff), diff ->
                val currentSize = if (diff == 0) 0 else if (diff * preDiff < 0) preSize + 1 else 1
                val currentMaxSize = maxOf(maxSize, currentSize)
                Triple(currentMaxSize, currentSize, diff)
            }.first + 1
}

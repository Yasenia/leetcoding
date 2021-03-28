package leetcoding.algorithms.problem0387

import java.util.LinkedList
import java.util.Queue

class Solution2 : Solution {

    override fun firstUniqChar(s: String): Int {
        val queue: Queue<Int> = LinkedList()
        val counter = IntArray(26)
        for (i in s.indices) {
            if (++counter[s[i] - 'a'] > 1) while (queue.isNotEmpty() && counter[s[queue.peek()] - 'a'] > 1) queue.poll()
            else queue.offer(i)
        }
        return if (queue.isEmpty()) -1 else queue.peek()
    }
}

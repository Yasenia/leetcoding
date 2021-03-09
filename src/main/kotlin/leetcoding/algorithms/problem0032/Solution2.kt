package leetcoding.algorithms.problem0032

import java.util.Stack

class Solution2 : Solution {

    override fun longestValidParentheses(s: String): Int {
        val stack = Stack<Int>().apply { push(-1) }
        var longest = 0
        for (i in s.indices) {
            if (s[i] == '(') stack.push(i) else {
                if (stack.isNotEmpty()) stack.pop()
                if (stack.isEmpty()) stack.push(i) else longest = longest.coerceAtLeast(i - stack.peek())
            }
        }
        return longest
    }
}

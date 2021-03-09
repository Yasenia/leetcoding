package leetcoding.algorithms.problem1047

import java.util.Stack

class Solution1 : Solution {

    override fun removeDuplicates(s: String): String {
        val stack = Stack<Char>()
        for (c in s) if (stack.isEmpty() || stack.peek() != c) stack.push(c) else stack.pop()
        return String(stack.toCharArray())
    }
}

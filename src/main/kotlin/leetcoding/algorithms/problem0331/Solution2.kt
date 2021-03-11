package leetcoding.algorithms.problem0331

import java.util.Stack

class Solution2 : Solution {

    override fun isValidSerialization(preorder: String): Boolean {
        val stack = Stack<Int>().apply { push(1) }
        for (s in preorder.split(",")) {
            if (stack.isEmpty()) return false
            stack.push(stack.pop() - 1)
            while (stack.isNotEmpty() && stack.peek() == 0) stack.pop()
            if (s != "#") stack.push(2)
        }
        return stack.isEmpty()
    }
}

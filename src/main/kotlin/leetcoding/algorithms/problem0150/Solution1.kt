package leetcoding.algorithms.problem0150

import java.util.Stack

class Solution1 : Solution {

    override fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        for (token in tokens) when (token) {
            "+" -> stack.push(stack.pop() + stack.pop())
            "-" -> stack.push(stack.pop().let { stack.pop() - it })
            "*" -> stack.push(stack.pop() * stack.pop())
            "/" -> stack.push(stack.pop().let { stack.pop() / it })
            else -> stack.push(token.toInt())
        }
        return stack.peek()
    }
}

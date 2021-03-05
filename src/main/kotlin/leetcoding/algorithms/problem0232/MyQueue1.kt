package leetcoding.algorithms.problem0232

import java.util.Stack

class MyQueue1 : MyQueue {

    private val outStack = Stack<Int>()
    private val inStack = Stack<Int>()

    override fun push(x: Int) {
        inStack.push(x)
    }

    override fun pop(): Int {
        if (outStack.isEmpty()) while (inStack.isNotEmpty()) outStack.push(inStack.pop())
        return outStack.pop()
    }

    override fun peek(): Int {
        if (outStack.isEmpty()) while (inStack.isNotEmpty()) outStack.push(inStack.pop())
        return outStack.peek()
    }

    override fun empty(): Boolean = inStack.isEmpty() && outStack.isEmpty()
}

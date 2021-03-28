package leetcoding.algorithms.problem0341

import leetcoding.core.datastructure.NestedInteger
import java.util.Stack

class NestedIterator1(nestedList: List<NestedInteger>) : NestedIterator {

    private val stack = Stack<NestedInteger>()

    init {
        pushAll(nestedList)
    }

    private fun pushAll(list: List<NestedInteger>) {
        for (i in list.indices.reversed()) stack.push(list[i])
    }

    override fun next(): Int {
        if (stack.peek().isInteger()) return stack.pop().getInteger()!!
        pushAll(stack.pop().getList()!!)
        return next()
    }

    override fun hasNext(): Boolean {
        if (stack.isEmpty()) return false
        if (stack.peek().isInteger()) return true
        pushAll(stack.pop().getList()!!)
        return hasNext()
    }
}

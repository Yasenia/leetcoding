package leetcoding.algorithms.problem0227

import java.util.Stack

class Solution1 : Solution {

    override fun calculate(s: String): Int {
        val operatorStack = Stack<Char>()
        val resultStack = Stack<Int>()
        var i = s.lastIndex
        while (i >= 0) {
            val c = s[i--]
            if (c == ' ') continue
            if (c in '0'..'9') {
                var num = c - '0'
                var base = 1
                while (i >= 0 && s[i] in '0'..'9') {
                    base *= 10
                    num += base * (s[i--] - '0')
                }
                resultStack.push(num)
            } else {
                if ((i < 0 || s[i] == '(') && c in "+-*/") resultStack.push(0)
                if (c == '(') resultStack.reduceWhile(operatorStack) { it != ')' } else if (c in "+-") resultStack.reduceWhile(operatorStack) { it in "*/" }
                if (c == '(') operatorStack.pop() else operatorStack.push(c)
            }
        }
        resultStack.reduceWhile(operatorStack) { true }
        return resultStack.pop()
    }

    private fun Stack<Int>.reduceWhile(operatorStack: Stack<Char>, predicate: (operator: Char) -> Boolean) {
        while (operatorStack.isNotEmpty() && predicate(operatorStack.peek())) when (operatorStack.pop()) {
            '+' -> push(pop() + pop())
            '-' -> push(pop() - pop())
            '*' -> push(pop() * pop())
            '/' -> push(pop() / pop())
        }
    }
}

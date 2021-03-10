package leetcoding.algorithms.problem0224

import java.util.Stack

class Solution2 : Solution {

    override fun calculate(s: String): Int {
        val wrappedStr = "($s)"
        val operatorStack = Stack<Char>()
        val resultStack = Stack<Int>()
        var i = wrappedStr.lastIndex
        while (i >= 0) when (val c = wrappedStr[i--]) {
            ')', '+', '-' -> {
                operatorStack.push(c)
                if (i < 0 || wrappedStr[i] == '(') resultStack.push(0)
            }
            '(' -> {
                while (operatorStack.peek() != ')') when (operatorStack.pop()) {
                    '+' -> resultStack.push(resultStack.pop() + resultStack.pop())
                    '-' -> resultStack.push(resultStack.pop() - resultStack.pop())
                }
                operatorStack.pop()
            }
            in '0'..'9' -> {
                var j = i
                while (j >= 0 && wrappedStr[j] in '0'..'9') j--
                resultStack.push(wrappedStr.substring(j + 1, i + 2).toInt())
                i = j
            }
        }
        return resultStack.pop()
    }
}

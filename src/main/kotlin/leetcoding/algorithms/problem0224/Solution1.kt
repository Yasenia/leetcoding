package leetcoding.algorithms.problem0224

import java.util.Stack

class Solution1 : Solution {

    override fun calculate(s: String): Int {
        // tokenization
        val tokens = Stack<String>()
        var i = 0
        while (i <= s.lastIndex) when (s[i]) {
            ' ' -> i++
            '(', ')' -> tokens.push(s[i++].toString())
            '+', '-' -> {
                if (tokens.isEmpty() || tokens.peek() == "(") tokens.push("0")
                tokens.push(s[i++].toString())
            }
            in '0'..'9' -> {
                var j = i + 1
                while (j <= s.lastIndex && s[j] in '0'..'9') j++
                tokens.push(s.substring(i, j))
                i = j
            }
        }

        // convert to prefix expression
        val prefixExpression = Stack<String>()
        val operatorStack = Stack<String>()
        while (tokens.isNotEmpty()) when (val token = tokens.pop()) {
            ")", "+", "-" -> operatorStack.push(token)
            "(" -> {
                while (operatorStack.peek() != ")") prefixExpression.push(operatorStack.pop())
                operatorStack.pop()
            }
            else -> prefixExpression.push(token)
        }
        while (operatorStack.isNotEmpty()) prefixExpression.push(operatorStack.pop())

        // evaluate result
        val resultStack = Stack<Int>()
        for (token in prefixExpression) when (token) {
            "+" -> resultStack.push(resultStack.pop() + resultStack.pop())
            "-" -> resultStack.push(resultStack.pop() - resultStack.pop())
            else -> resultStack.push(token.toInt())
        }
        return resultStack.pop()
    }
}

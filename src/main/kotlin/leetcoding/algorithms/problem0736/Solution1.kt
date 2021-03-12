package leetcoding.algorithms.problem0736

class Solution1 : Solution {

    override fun evaluate(expression: String): Int = evaluate(expression.tokenization()).second

    /**
     * evaluate the value of subexpression start from the specified index[i] in the given expression[tokens]
     * @param variables the variables context
     * @return Pair(the last index of subexpression, value of subexpression)
     * */
    private fun evaluate(tokens: List<String>, variables: Map<String, Int> = emptyMap(), i: Int = 0): Pair<Int, Int> =
        if (tokens[i] != "(") i to (variables[tokens[i]] ?: tokens[i].toInt())
        else when (val operator = tokens[i + 1]) {
            "add", "mult" -> {
                val (i1, v1) = evaluate(tokens, variables, i + 2)
                val (i2, v2) = evaluate(tokens, variables, i1 + 1)
                i2 + 1 to if (operator == "add") v1 + v2 else v1 * v2
            }
            "let" -> {
                var j = i + 2
                var subVariables = variables
                while (tokens[j] != "(" && tokens[j + 1] != ")") {
                    val name = tokens[j]
                    val (k, value) = evaluate(tokens, subVariables, j + 1)
                    subVariables = subVariables + (name to value)
                    j = k + 1
                }
                val (index, value) = evaluate(tokens, subVariables, j)
                index + 1 to value
            }
            else -> throw IllegalArgumentException()
        }

    private fun String.tokenization(): List<String> {
        val tokens = mutableListOf<String>()
        var buffer: String? = null
        for (c in this) {
            if (c in "() ") buffer?.also { tokens.add(it) }?.also { buffer = null } else buffer = (buffer ?: "") + c
            if (c in "()") tokens.add(c.toString())
        }
        return tokens
    }
}

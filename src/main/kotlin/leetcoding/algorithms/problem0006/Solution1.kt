package leetcoding.algorithms.problem0006

import java.lang.StringBuilder

class Solution1 : Solution {

    override fun convert(s: String, numRows: Int): String {
        val loopSize = (numRows - 1) * 2
        if (loopSize <= 0) return s
        val rows = Array(numRows) { StringBuilder() }
        s.forEachIndexed { index, c ->
            val i = index % loopSize
            val rowIndex = if (i < numRows) i else (loopSize - i)
            rows[rowIndex].append(c)
        }
        return rows.joinToString("")
    }
}

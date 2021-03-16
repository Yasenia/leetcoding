package leetcoding.algorithms.problem0318

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<String>, Int>() {

    override val solutions: List<ISolution<Array<String>, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Array<String>, Int>> = listOf(
        arrayOf("abcw", "baz", "foo", "bar", "xtfn", "abcdef") to 16,
        arrayOf("a", "ab", "abc", "d", "cd", "bcd", "abcd") to 4,
        arrayOf("a", "aa", "aaa", "aaaa") to 0,
    )
}

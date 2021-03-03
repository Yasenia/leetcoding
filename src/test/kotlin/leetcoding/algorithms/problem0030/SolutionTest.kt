package leetcoding.algorithms.problem0030

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, Array<String>>, List<Int>>() {

    override val solutions: List<ISolution<Pair<String, Array<String>>, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<String, Array<String>>, List<Int>>> = listOf(
        Pair("barfoothefoobarman", arrayOf("foo", "bar")) to listOf(0, 9),
        Pair("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "word")) to listOf(),
        Pair("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "good")) to listOf(8),
        Pair("barfoofoobarthefoobarman", arrayOf("bar", "foo", "the")) to listOf(6, 9, 12),
    )
}

package leetcoding.algorithms.problem0823

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(2, 4) to 3,
        intArrayOf(2, 4, 5, 10) to 7,
        jacksonObjectMapper().readValue<IntArray>(this::class.java.classLoader.getResource("problem0823/input01.json")!!) to 874417692,
    )
}

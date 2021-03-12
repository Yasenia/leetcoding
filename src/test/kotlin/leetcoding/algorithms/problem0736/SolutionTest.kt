package leetcoding.algorithms.problem0736

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1())

    override val testCases: List<Pair<String, Int>> = listOf(
        "(add 1 2)" to 3,
        "(mult 3 (add 2 3))" to 15,
        "(let x 2 (mult x 5))" to 10,
        "(let x 2 (mult x (let x 3 y 4 (add x y))))" to 14,
        "(let x 3 x 2 x)" to 2,
        "(let x 1 y 2 x (add x y) (add x y))" to 5,
        "(let x 2 (add (let x 3 (let x 4 x)) x))" to 6,
        "(let a1 3 b2 (add a1 1) b2)" to 4,
    )
}

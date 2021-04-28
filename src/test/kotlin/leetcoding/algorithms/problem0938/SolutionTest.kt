package leetcoding.algorithms.problem0938

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<Triple<TreeNode?, Int, Int>, Int>() {

    override val solutions: List<ISolution<Triple<TreeNode?, Int, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<TreeNode?, Int, Int>, Int>> = listOf(
        Triple(binaryTreeOf(10, 5, 15, 3, 7, null, 18), 7, 15) to 32,
        Triple(binaryTreeOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6), 6, 10) to 23,
    )
}

package leetcoding.algorithms.problem1145

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<Triple<TreeNode?, Int, Int>, Boolean>() {

    override val solutions: List<ISolution<Triple<TreeNode?, Int, Int>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<TreeNode?, Int, Int>, Boolean>> = listOf(
        Triple(binaryTreeOf(1, 2, 3), 3, 1) to false,
        Triple(binaryTreeOf(1, 2, 3, 4, 5), 5, 1) to true,
        Triple(binaryTreeOf(1, 2, 3, 4, 5), 5, 2) to false,
        Triple(binaryTreeOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), 11, 3) to true,
        Triple(binaryTreeOf(1, 2, 3, 4, 5, 6, 7, null, null, 10, 11), 11, 3) to true,
    )
}

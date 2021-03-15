package leetcoding.core.datastructure

fun binaryTreeOf(vararg values: Int?): TreeNode? = binaryTreeOf(values, 0)

private fun binaryTreeOf(values: Array<out Int?>, root: Int): TreeNode? =
    if (root > values.lastIndex) null
    else values[root]?.let {
        TreeNode(
            it,
            binaryTreeOf(values, root * 2 + 1),
            binaryTreeOf(values, root * 2 + 2)
        )
    }

package leetcoding.algorithms.problem0173

import leetcoding.core.datastructure.TreeNode
import java.util.Stack

class BSTIterator1(treeNode: TreeNode?) : BSTIterator {

    private val stack = Stack<TreeNode>()

    init {
        pushTree(treeNode)
    }

    private fun pushTree(treeNode: TreeNode?) {
        var node = treeNode
        while (node != null) {
            stack.push(node)
            node = node.left
        }
    }

    override fun next(): Int = stack.pop().also { pushTree(it.right) }.value

    override fun hasNext(): Boolean = stack.isNotEmpty()
}

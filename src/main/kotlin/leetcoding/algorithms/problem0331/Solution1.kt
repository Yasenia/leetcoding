package leetcoding.algorithms.problem0331

class Solution1 : Solution {

    override fun isValidSerialization(preorder: String): Boolean {
        val preorderNodes = preorder.split(",").toTypedArray()
        return lastOfTree(preorderNodes, 0) == preorderNodes.lastIndex
    }

    private fun lastOfTree(preorderNodes: Array<String>, root: Int): Int? {
        if (root > preorderNodes.lastIndex) return null
        if (preorderNodes[root] == "#") return root
        val lastOfLeftTree = lastOfTree(preorderNodes, root + 1) ?: return null
        return lastOfTree(preorderNodes, lastOfLeftTree + 1)
    }
}

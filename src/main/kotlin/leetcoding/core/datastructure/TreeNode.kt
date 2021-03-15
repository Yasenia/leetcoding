package leetcoding.core.datastructure

class TreeNode(
    val value: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
) {

    override fun equals(other: Any?): Boolean = this === other || (other is TreeNode && value == other.value && left == other.left && right == other.right)

    override fun hashCode(): Int = 31 * 31 * value + 31 * (left?.hashCode() ?: 0) + (right?.hashCode() ?: 0)

    override fun toString(): String = "TreeNode(value=$value, left=$left, right=$right)"

    fun copy(): TreeNode = TreeNode(this.value, this.left?.copy(), this.right?.copy())
}

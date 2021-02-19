package leetcoding.core.datastructure

class ListNode(
    val value: Int,
    var next: ListNode? = null
) {

    override fun equals(other: Any?): Boolean = this === other || other is ListNode && value == other.value && next == other.next

    override fun hashCode(): Int = 31 * value + (next?.hashCode() ?: 0)

    override fun toString(): String = generateSequence(this) { it.next }.joinToString(", ", "LinkedList: [", "]") { it.value.toString() }

    fun copy(): ListNode = ListNode(this.value, this.next?.copy())
}

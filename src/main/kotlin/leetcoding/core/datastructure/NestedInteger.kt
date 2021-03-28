package leetcoding.core.datastructure

class NestedInteger {

    constructor() {
        this.list = emptyList()
    }

    constructor(value: Int) {
        this.value = value
    }

    private var value: Int? = null
    private var list: List<NestedInteger>? = null

    fun isInteger(): Boolean = this.value != null

    fun getInteger(): Int? = this.value

    fun setInteger(value: Int) {
        this.value = value
        this.list = null
    }

    fun add(ni: NestedInteger) {
        this.list = (list ?: listOfNotNull(value).map { NestedInteger(it) }) + ni
    }

    fun getList(): List<NestedInteger>? = this.list

    private fun nestedString(): String = this.list?.joinToString(", ", "[", "]") { it.nestedString() } ?: this.value.toString()

    override fun toString(): String = "NestedInteger(${this.nestedString()})"
}

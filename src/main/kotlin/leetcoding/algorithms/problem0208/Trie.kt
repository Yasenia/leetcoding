package leetcoding.algorithms.problem0208

interface Trie {

    fun insert(word: String)

    fun search(word: String): Boolean

    fun startsWith(prefix: String): Boolean
}

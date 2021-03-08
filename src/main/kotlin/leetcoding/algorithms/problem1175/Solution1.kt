package leetcoding.algorithms.problem1175

class Solution1 : Solution {

    override fun numPrimeArrangements(n: Int): Int {
        val primesCount = primes().takeWhile { it <= n }.count()
        val mod = 1000000007
        return multiplyMod(factorialMod(primesCount, mod), factorialMod(n - primesCount, mod), mod)
    }

    private tailrec fun factorialMod(n: Int, mod: Int, acc: Int = 1): Int = if (n > 0) factorialMod(n - 1, mod, multiplyMod(acc, n, mod)) else acc

    private fun multiplyMod(n1: Int, n2: Int, mod: Int): Int = when {
        n1 == 0 -> 0
        n1 % 2 == 0 -> multiplyMod(n1 / 2, n2 * 2 % mod, mod)
        else -> (n2 + multiplyMod(n1 - 1, n2, mod)) % mod
    }

    private fun primes(): Sequence<Int> = mutableListOf<Int>().let { primes ->
        generateSequence(2) { it + 1 }.filter { primes.all { p -> it % p != 0 } }.onEach { primes.add(it) }
    }
}

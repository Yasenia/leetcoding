package leetcoding.algorithms.problem1603

import leetcoding.core.ISolution

/**
 * [Problem 1603](https://leetcode.com/problems/design-parking-system/)
 * */
interface Solution : ISolution<Pair<Triple<Int, Int, Int>, List<(ParkingSystem) -> Any>>, List<Any>> {

    override fun solve(input: Pair<Triple<Int, Int, Int>, List<(ParkingSystem) -> Any>>): List<Any> {
        val (big, medium, small) = input.first
        val parkingSystem = buildParkingSystem(big, medium, small)
        return input.second.map { it.invoke(parkingSystem) }
    }

    fun buildParkingSystem(big: Int, medium: Int, small: Int): ParkingSystem
}

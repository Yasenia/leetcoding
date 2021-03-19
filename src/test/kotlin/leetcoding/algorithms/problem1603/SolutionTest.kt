package leetcoding.algorithms.problem1603

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Triple<Int, Int, Int>, List<(ParkingSystem) -> Any>>, List<Any>>() {

    override val solutions: List<ISolution<Pair<Triple<Int, Int, Int>, List<(ParkingSystem) -> Any>>, List<Any>>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<Triple<Int, Int, Int>, List<(ParkingSystem) -> Any>>, List<Any>>> = listOf(
        Pair(
            Triple(1, 1, 0),
            listOf<(ParkingSystem) -> Any>(
                { it.addCar(1) },
                { it.addCar(2) },
                { it.addCar(3) },
                { it.addCar(1) },
            )
        ) to listOf(
            true,
            true,
            false,
            false,
        )
    )
}

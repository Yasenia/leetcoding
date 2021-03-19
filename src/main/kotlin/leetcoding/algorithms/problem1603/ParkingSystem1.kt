package leetcoding.algorithms.problem1603

class ParkingSystem1(
    private val big: Int,
    private val medium: Int,
    private val small: Int,
) : ParkingSystem {
    private var bigCount = 0
    private var mediumCount = 0
    private var smallCount = 0

    override fun addCar(carType: Int): Boolean {
        when (carType) {
            1 -> if (bigCount < big) bigCount++ else return false
            2 -> if (mediumCount < medium) mediumCount++ else return false
            3 -> if (smallCount < small) smallCount++ else return false
        }
        return true
    }
}

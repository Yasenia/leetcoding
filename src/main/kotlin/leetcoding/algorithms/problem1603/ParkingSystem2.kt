package leetcoding.algorithms.problem1603

class ParkingSystem2(
    private var big: Int,
    private var medium: Int,
    private var small: Int,
) : ParkingSystem {

    override fun addCar(carType: Int): Boolean {
        when (carType) {
            1 -> if (big > 0) big-- else return false
            2 -> if (medium > 0) medium-- else return false
            3 -> if (small > 0) small-- else return false
        }
        return true
    }
}

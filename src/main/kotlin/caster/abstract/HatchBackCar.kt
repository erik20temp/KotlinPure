package caster.abstract

class HatchBackCar(
    color: String,
    numOfWheels: Int,
    numOfDoors: Int
) : Vehicle(color, numOfWheels, numOfDoors) {
    override fun drive() {
        println("HatchBack is driving slow")
    }
}
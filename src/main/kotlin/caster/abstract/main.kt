package caster.abstract

fun main() {
    val lambo = Lambo()
    val hatchBackCar = HatchBackCar("blue", 4, 2)

    driveVehicle(lambo)
    driveVehicle(hatchBackCar)

}

fun driveVehicle(vehicle: Vehicle) {
    vehicle.drive()
}
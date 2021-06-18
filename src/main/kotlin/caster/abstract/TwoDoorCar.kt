package caster.abstract

abstract class TwoDoorCar(
    color: String,
    numOfWheels: Int
) : Vehicle(color, numOfWheels, 2){
    abstract fun driveFast()
}
package caster.abstract

abstract class Vehicle(
    var color: String,
    val numOfWheels: Int,
    val numOfDoors: Int
) {

    abstract fun drive()

    fun openDoor(){
        // ... opens door
    }

    fun turnOffIgnition(){
        // ... turn off ignition
    }
}
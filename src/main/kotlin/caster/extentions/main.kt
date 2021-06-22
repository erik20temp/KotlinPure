package caster.extentions

fun main() {
    val name = "Irek Wyka"
    println(name.initials())

    val age = 55
    println(age.isAdult())

    val person = Person("Bartek", "Wyka", 25)
    val fullName = person.fullName()
    val adult: String = if (age.isAdult()) "yes" else "no"

    println("$fullName initials: ${fullName.initials()} is adult: $adult")
}
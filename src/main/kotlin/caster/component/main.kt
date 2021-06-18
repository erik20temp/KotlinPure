package caster.component

fun main() {

    val p1 = Person("John", "Doe", 28)
    val firstName = p1.component1()
    val lastName = p1.component2()

    val age = p1.component3()

    val (fName, lName, pAge) = p1

    println(fName)
    println(pAge)
    println(lName)
    println()
    println(age)
    println(lastName)
    println(firstName)
}
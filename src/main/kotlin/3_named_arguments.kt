fun greetPerson(greeting:String, name:String) = println("$greeting $name")
fun greetPerson1(greeting:String = "Hi", name:String = "Kotlin") = println("$greeting $name")
fun greetPerson2(greeting:String = "", name:String = "") = println("$greeting $name")


fun main() {
    greetPerson("Hi", "Erik")
    greetPerson(greeting = "Hi", name = "Erik")
    greetPerson(name = "Erik", greeting = "Hi")
    greetPerson1(name = "Erik", greeting = "Hello")
    greetPerson1(name = "Erik")
    greetPerson1(greeting = "Hello")
    greetPerson1()
    greetPerson2(name = "Erik", greeting = "Hello")
    greetPerson2(name = "Erik")
    greetPerson2(greeting = "Hello")
    greetPerson2()
}
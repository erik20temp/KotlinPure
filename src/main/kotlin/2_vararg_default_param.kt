// 'vararg' represents variable number of arguments
private fun sayHello(greeting: String, vararg itemsToGreet: String) {

    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

private fun main() {
//    val items = listOf("Kotlin", "Java", "Programming")
//    sayHello("Hi", listOf()) #but its not flexible
//    we put 'vararg to sayHello function
    sayHello("Hi")
//    or
    sayHello("Hi", "Kotlin", "Java", "Programming")
//    but this is not valid: sayHello("Hi", items)
//    change 'listOf' to 'arrayOf' and add '*' to argument

    val items = arrayOf("Kotlin", "Java", "Programming")
    sayHello("Hi", *items)
}



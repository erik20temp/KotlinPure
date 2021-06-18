/*
private fun sayHello(greeting: String, itemsToGreet: List<String>) {

    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

private fun main() {
    val items = listOf("Kotlin", "Java", "Programming")
    sayHello("Hi", items)


    val things =  arrayOf("Kotlin", "Java", "Programming")
    println()
    println("--- arrayOf, listOf, mapOf are immutable, can not be changed. ---")
    println("--- function 'add' or 'put' are unavailable. ---")
    println("--- to make changes we are using 'mutableListOf' or 'mutableMapOf' functions. ---")
    println()
    println("*** arrayOf ***")
    println(things.size)
    println(things[1])
    println(things.get(1))
    println()
    println("*** for loop ***")
    for (thing in things){
        println(thing)
    }
    println()
    println("*** forEach loop ***")
    things.forEach { thing ->
        println(thing)
    }
    println()
    println("*** forEachIndexed loop ***")
    things.forEachIndexed {index, thing ->
        println("$thing is at index: $index")
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    println()
    println("*** mapOf ***")
    println("*** forEach loop ***")
    map.forEach { (key, value) -> println("key: $key => value: $value") }

}*/

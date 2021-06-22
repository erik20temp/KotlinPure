package caster.flatmap

fun main() {

    val groceryBags = listOf(
        ShoppingBag(listOf("Grapes", "Apples", "Oranges")),
        ShoppingBag(listOf("Tea", "Milk", "Coffee")),
        ShoppingBag(listOf("Bread", "Eggs", "Butter"))
    )

    val retailBags = listOf(
        ShoppingBag(listOf("Shirt", "Pants", "Trouser")),
        ShoppingBag(listOf("Socks", "Shoes")),
        ShoppingBag(listOf("Jacket", "Sweater", "Scarf"))
    )

    val groceries = groceryBags.flatMap { it.items }
    println(groceries)
    println(groceries[0])
    println(groceries[1])
    println(groceries[2])

    val cloths = retailBags.map { it.items }
    println(cloths)
    println(cloths[0])
    println(cloths[1])
    println(cloths[2])
}

class ShoppingBag(val items: List<String>)
package caster.singleton

fun main() {
    // 1 Instance -Singleton
    println("My favrite food is: ${FavoriteFood.name}")
    FavoriteFood.name = "Pizza"
    println("My favrite food is: ${FavoriteFood.name}")
    FavoriteFood.ingredients.add("tomato")
    FavoriteFood.ingredients.add("cheese")
    FavoriteFood.ingredients.add("ham")

    FavoriteFood.ingredients.forEach{ ingredient ->
        println(ingredient)
    }

    print("Is FavoriteFood Singleton? ")
    println(FavoriteFood == FavoriteFood)
    print("Is FavoriteFood this same type? ")
    println(FavoriteFood === FavoriteFood)
}
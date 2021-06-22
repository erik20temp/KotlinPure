package caster.sets

fun main() {

    // The values in set are unique
    val names = mutableSetOf("Mike", "Tom", "John", "Betty", "Tom", "Betty")
    println(names)
    // prints: [Mike, Tom, John, Betty]

    val people = setOf(
        Person("Mike"),
        Person("Mike"),
        Person("Tom"),
        Person("Betty"),
        Person("Tom")
    )

    println(people)
    // if class Person is without 'data' modifier
    // prints
    // [caster.sets.Person@4fca772d, caster.sets.Person@9807454, caster.sets.Person@3d494fbf, caster.sets.Person@1ddc4ec2]
    // if class Person is with 'data' modifier
    // prints
    // [Person(name=Mike), Person(name=Tom), Person(name=Betty)]

    val people1 = listOf(
        Person("Mike"),
        Person("Tom"),
        Person("Betty"),
        Person("Janet")
    )

    val people2 = listOf(
        Person("Mike"),
        Person("Kevin"),
        Person("Tom"),
        Person("Betty"),
        Person("Tom"),
        Person("Cathy")
    )

    val uniqueValues: Set<Person> = people1.union(people2)
    println(uniqueValues)
    // prints
    // [Person(name=Mike), Person(name=Tom), Person(name=Betty), Person(name=Janet), Person(name=Kevin), Person(name=Cathy)]

}

data class Person(val name: String)
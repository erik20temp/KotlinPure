package caster.companion

fun main() {
    val user = User.createUser("John", "Doe")
    println(user)

    User.createUsers(2)
    val users = User.users
    users.forEach { user -> println(user) }


}



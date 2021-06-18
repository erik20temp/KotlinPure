package caster.companion

class User(var firstName: String, var lastName: String) {

// companion object is like static class in java it give us direct access to the Class without init
    companion object {
        val users = mutableListOf<User>()
        fun createUsers(count: Int): List<User>{
            for (i in 1..count){
                users.add(User("FirstName$i", "Lastname$i"))
            }
            return users
        }
        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }
    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return fullName()
    }
}
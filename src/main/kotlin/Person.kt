//    class Person(val firstName:String, val lastName:String) {
//    constructor():this("Peter", "Parker")

//    better way
class Person(private val firstName:String = "Peter", private val lastName:String = "Parker") {

    var nickName:String? = null

    fun printName(){
        val nickNameToPrint =  nickName ?: "no nickname"
        println("$firstName $lastName ($nickNameToPrint)")
    }
}


fun main() {

    val peter = Person()
    peter.printName()
    val robert = Person("Robert", "Ladlum")
    robert.nickName = "RL"
    robert.nickName = "LR"
    robert.printName()


}
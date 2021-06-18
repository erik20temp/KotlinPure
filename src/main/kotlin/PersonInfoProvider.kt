interface PersonInfoProvider {
    val providerInfo:String

    fun printName(person: Person) {
        println(providerInfo)
        person.printName()
    }
}

interface SessionInfoProvider{
    fun getSessionId():String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printName(person: Person) {
        super.printName(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return "Session ID"
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printName(Person())
    provider.getSessionId()
    checkType(provider)
}

fun checkType(infoProvider: PersonInfoProvider){
    if (infoProvider is SessionInfoProvider){
        println("is session interface")
        infoProvider .getSessionId()
    }else{
        println("is not session interface")
    }
}
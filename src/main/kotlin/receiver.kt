
class NotListView

class NotDetailView

class LogView

// Every thing what is before '.' is called 'Receiver'
// <Receiver>.functionName
fun Any.showMessage(message: String) = println(message)

fun main() {
    val list = NotListView()
    val detail = NotDetailView()
    val login = LogView()

    list.showMessage("Open")
    detail.showMessage("for")
    login.showMessage("Extension")

}
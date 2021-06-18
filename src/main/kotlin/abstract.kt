
class NoteListView : View()

class NoteDetailView : View()

class LoginView : View()

abstract class View{
    fun showMessage(message: String) = println(message)
}

fun main() {
    val list = NoteListView()
    val detail = NoteDetailView()
    val login = LoginView()

    list.showMessage("Open")
    detail.showMessage("for")
    login.showMessage("Extension")

}
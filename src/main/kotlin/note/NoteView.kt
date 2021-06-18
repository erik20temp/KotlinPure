package note

class NoteView(val logic: INoteContract.Logic) : INoteContract.View{
    override fun displayResult(result: String) = println(result)

    fun clickOnStart() = logic.handleEvent(ViewEvent.OnStart)
    fun clickLogin() = logic.handleEvent(ViewEvent.LoginClick)
    fun clickLogout() = logic.handleEvent(ViewEvent.LogoutClick)
}
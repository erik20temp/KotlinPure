package note

class NoteRepositoryImpl (
    val localDatabase: INoteRepsitory,
    val remoteDatabase: INoteRepsitory
    ) : INoteRepsitory {

    override fun getNote(): NoteResult {
        val remoteResult =  remoteDatabase.getNote()

        when(remoteResult){
            is NoteResult.Success -> return remoteResult
            is NoteResult.Error -> return localDatabase.getNote()
        }
    }
}

object LocalRepositoryImpl : INoteRepsitory {
    override fun getNote(): NoteResult = NoteResult.Success("Effort and Patience from Local")
}

object RemoteRepositoryImpl : INoteRepsitory {
    override fun getNote(): NoteResult = NoteResult.Error
}

// Application Container
// 1. Create different things in this program
// 2. Binds different things in this program together
// 3. Set the program in motion

fun main() {
    val data = NoteRepositoryImpl(LocalRepositoryImpl, RemoteRepositoryImpl)
    val logic = NoteLogic()
    val view = NoteView(logic)

    logic.repository = data
    logic.view = view

    view.clickOnStart()
}
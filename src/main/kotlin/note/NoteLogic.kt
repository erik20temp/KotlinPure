package note

class NoteLogic : INoteContract.Logic {

    // This is necessary because the View requires Logic class in its constructor
    lateinit var repository: INoteRepsitory
    lateinit var view: INoteContract.View

    override fun handleEvent(event: ViewEvent) {
       when (event) {
           is ViewEvent.OnStart -> getData()
           is ViewEvent.LoginClick -> getData()
           is ViewEvent.LogoutClick -> getData()
       }
    }

    fun getData(){
        val result = repository.getNote()
        when (result){
            is NoteResult.Success -> view.displayResult(result.noteContents)
            is NoteResult.Error -> view.displayResult(GENERIC_ERROR)
        }
    }

}

const val GENERIC_ERROR = "An Error has occurred"


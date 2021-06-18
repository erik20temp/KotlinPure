package note

sealed class NoteResult{

    object Error : NoteResult()
    data class Success(val noteContents: String) : NoteResult()
}

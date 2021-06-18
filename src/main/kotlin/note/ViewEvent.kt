package note

sealed class ViewEvent {
    object OnStart : ViewEvent()
    object LoginClick : ViewEvent()
    object LogoutClick : ViewEvent()
}

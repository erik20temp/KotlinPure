package note

// Contract interface - No brackets for interfaces
interface INoteContract {

    interface View{
        fun displayResult(result: String)
    }

    interface Logic{
        fun handleEvent(event: ViewEvent)
    }
}
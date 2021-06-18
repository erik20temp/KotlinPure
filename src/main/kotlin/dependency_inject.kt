// 3
class DecisionMaker(
    private val repository: IRepository,
    private val userInterface: IView
){
    fun start(){
        userInterface.displayData(repository.getData())
    }
}
// 1
interface IRepository{
    fun getData(): String
}
// 1
interface IView{
    fun displayData(data: String)
}
// 2
object Repository : IRepository{
    override fun getData(): String = "Some Data"
}
// 2
object InterfaceView : IView {
    override fun displayData(data: String)  = println(data)

}
// 4
class DependencyProvider{
    fun provideRepository(): IRepository = Repository
    fun provideView(): IView = InterfaceView
}

// 5
fun main() {
    val provider = DependencyProvider()
    DecisionMaker(
        provider.provideRepository(),
        provider.provideView()
    ).start()
}

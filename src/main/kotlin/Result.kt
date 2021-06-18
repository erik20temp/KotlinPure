
// mimic an interaction between different components of an program
fun requestData(){
    when (val result = InputOutputDevice.getData()) {
        is Result.Loading -> UserInterface.showLoadingScreen()
        is Result.Success -> UserInterface.showData(result.value)
        is Result.Error -> UserInterface.showErrorMessage()

    }
}

object InputOutputDevice {
    fun getData(): Result {
        return Result.Success("Success")
    }

}

sealed class Result{

    // For events, we creat a class or object. Object work when we don't need any data
    // Data class when we work with data
    object Loading: Result()
    object Error: Result()
    data class Success(val value: String): Result()
}

object UserInterface {
    fun showLoadingScreen() {
        TODO("Not yet implemented")
    }

    fun showData(value: String) {
        TODO("Not yet implemented")
    }

    fun showErrorMessage() {
        TODO("Not yet implemented")
    }
}

enum class MathOperator(val op: Char){
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/')
}

// Function type
fun checkMathOperator(op: MathOperator): (Double, Double) -> Double{
    return when(op){
                        // lambda expression
                        // arguments // body
        MathOperator.PLUS -> {x , y -> x + y}
        MathOperator.MINUS -> {x , y -> x - y}
        MathOperator.MULTIPLY -> {x , y -> x * y}
        MathOperator.DIVIDE -> {x , y -> x / y}
    }
}

fun main() {
    val mathFunc = checkMathOperator(MathOperator.PLUS)

    println(mathFunc.invoke(5.0, 10.0))
}
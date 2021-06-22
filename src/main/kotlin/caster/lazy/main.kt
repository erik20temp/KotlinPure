package caster.lazy

import java.lang.Thread.sleep
import kotlin.random.Random


fun main() {

    val name: String by lazy {
        println("Computed")
        sleep(3000)
        "Donn"
    }

    println(name)
    sleep(500)
    println(name)
    sleep(500)
    println(name)
    sleep(2500)
    val result = lazy { expensiveOperation() }
    println(result)
    println("Is Initialized: ${result.isInitialized()}")
    println(result.value)
}

fun expensiveOperation(): Int {
    println("Calculate")
    sleep(1500)
    return  Random(System.currentTimeMillis()).nextInt()

}
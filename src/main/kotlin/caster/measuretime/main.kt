package caster.measuretime

import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {

    measure {
        val sequence = generateSequence(1) { it + 1 }.take(50_000_000)
        val result= sequence.filter { it % 3 == 0 }.average()
        println(result)
    }
}

fun measure(block: () -> Unit) {
    val nanotime: Long = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanotime)
    println("$millis ms")
}
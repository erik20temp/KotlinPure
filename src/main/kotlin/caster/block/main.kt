package caster.block

fun main() {

    lineLogger{
        println("msg1")
        println("msg2")
        println("msg3")
    }

    repeater(2) { println("Welcome") }

    indexRepeat(4) { index ->
        // block
        if (index < 2 ) {
            println("Hello")
        } else {
            println("World")
        }
        // block
    }

    VBPlayers { player: String ->
        println("$player is a great asset to the team!")
    }

    repeat(4) { println("index $it")}
}

fun lineLogger(block: () -> Unit) {
    repeat(2) { println("**********") }
    block()
    repeat(2) { println("**********") }

}

fun repeater(times: Int, block: () -> Unit) {
    repeat(times) { block() }
}

fun indexRepeat(times: Int, block: (Int) -> Unit) {
    repeat(times) { index -> block(index)  }
}

fun VBPlayers(block: (String) -> Unit) {
    val players: List<String> = listOf(
        "Jakubowski",
        "Zatorski",
        "Kurek",
        "Leon",
        "Semeniuk"
    )

    val randomPlayer = players.random()
    println("The next player is ... $randomPlayer")
    println(block(randomPlayer))
}

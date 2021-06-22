package caster.extentions

fun String.initials(): String {
    val values: List<String> = this.split(' ')
    val firstInit = values[0].substring(0, 1)
    val lastInit = values[1].substring(0,1)
    return "$firstInit$lastInit"
}

fun Int.isAdult() = this >= 18

fun Person.fullName() = "${this.firstName} ${this.lastName}"